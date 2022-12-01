package creational.singlton;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

       Logger logger = Logger.getLogger();
       logger.log("Singleton Patter example");
       logger.closeStream();
    }
}
