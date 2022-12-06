package assignment8;

public class Main {

        public static void main(String[] args) {

            ThrowExceptionClass e=new ThrowExceptionClass();
            try {
                e.method1("Exception-one");
            }
            catch (Exception exception)
            {
                System.out.println(exception.getMessage());
            }
            finally
            {
                System.out.println("finally block excecuted");
            }
        }

}

class ThrowExceptionClass{
    void method1(String exception) throws CustomExceptionOne, CustomExceptionTwo, CustomExceptionThree {
        if (exception.equalsIgnoreCase("exception-one")) {
            throw new CustomExceptionOne("customized exception one");
        } else if (exception.equalsIgnoreCase("exception-two")) {
            throw new CustomExceptionTwo("customized exception two");
        } else if (exception.equalsIgnoreCase("exception-three")) {
            throw new CustomExceptionThree("customized exception three");
        }

    }
}
