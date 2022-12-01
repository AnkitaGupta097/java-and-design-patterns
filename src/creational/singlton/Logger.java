package creational.singlton;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Objects;

public class Logger {
   private static Logger logger;
   private  BufferedWriter writer;

   private Logger() throws IOException {
       File dir = new File("logs");
       dir.mkdir();
       File file = new File(dir ,"log.txt");
       writer = new BufferedWriter(new FileWriter( file, true));
   }

   public static Logger getLogger() throws IOException {
       if(Objects.isNull(logger)) {
           logger = new Logger();
       }
       return logger ;
   }

   public void log(String message) throws IOException {
       writer.append("\n");
       writer.append(message);
       writer.close();
   }

    public void closeStream() throws IOException {
       writer.close();
    }

}
