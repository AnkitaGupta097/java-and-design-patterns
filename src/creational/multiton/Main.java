package creational.multiton;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

      new Class1();
      new Class2();
      new Class1();
      new Class2();

      Logger logger = Logger.getLogger(Logger.class.getSimpleName());
      logger.log("inside main");
      logger.log("inside main 2");

      Logger.closeAllStreams();
    }
}
