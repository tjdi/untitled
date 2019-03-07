import java.io.IOException;

class MyException extends Throwable {
    public MyException(String xxxx) {
        super();
    }

}

public class Text {

//    void f() throws IndexOutOfBoundsException, Error, Throwable {
//
//    }

//    int f() {
//        try {
//            return 0;
//
//        }finally {
//            return 1;
//        }
//    }

    public static void main(String[] args) {

//            throws NullPointerException, IOException, Exception {
//        throw new Exception();
//    }

        try {
            if (args.length > 0)
                throw new MyException("xxxx");
            System.out.println("hello");
            return;
        } catch (Exception e) {
            e.printStackTrace();
        } catch (Throwable e) {
            System.out.println("catch...");
        } finally {
            System.out.println("finally");
        }
    }
}