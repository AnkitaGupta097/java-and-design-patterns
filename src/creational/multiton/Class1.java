package creational.multiton;

import java.io.IOException;

public class Class1 {
    Class1 () throws IOException {
        Logger logger =  Logger.getLogger(Class1.class.getSimpleName());
        logger.log("inside constructor Class1");
    }
}
