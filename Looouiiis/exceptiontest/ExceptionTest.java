package Looouiiis.exceptiontest;

public class ExceptionTest {
    public static void main(String[] args) throws Exception {
        try {
            show();
        }
        catch(Exception e){
            System.out.println(e);
        }
        System.out.println("HelloWorld");
    }

    public static void show() throws Exception {

            throw new Exception();
    }
}
