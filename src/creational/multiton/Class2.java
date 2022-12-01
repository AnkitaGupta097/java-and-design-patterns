package creational.multiton;

import java.io.IOException;

public class Class2 {
    Class2 () throws IOException {
       Logger logger =  Logger.getLogger(Class2.class.getSimpleName());
       logger.log("inside constructor Class2");
    }
}
