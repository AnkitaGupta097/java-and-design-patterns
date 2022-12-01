package creational.multiton;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

// to create one file for every class that calls the Logger.
public class Logger {
    private static Map<String, Logger> loggerMap = new HashMap();
    private BufferedWriter writer;

    private Logger(String filename) throws IOException {
        File dir = new File("logs");
        dir.mkdir();
        File file = new File(dir, filename + ".txt");
        writer = new BufferedWriter(new FileWriter(file, true));
    }


    public static Logger getLogger(String classname) throws IOException {
        String capClassname = classname.toUpperCase();
        if (!loggerMap.containsKey(capClassname)) {
            loggerMap.put(capClassname, new Logger(capClassname));
        }
        return loggerMap.get(capClassname);
    }

    public void log(String message) throws IOException {
        writer.append("\n");
        writer.append(message);
    }

    public void close() throws IOException {
        writer.close();
    }

    public static void closeAllStreams()  {
        loggerMap.values().forEach(logger -> {
            try {
                logger.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        });

    }
}