public class Test2 {
    static void f() throws Exception {
        try {
            g();
        } catch (Exception e) {
            throw new Exception("fn",e);
        }
    }

    static void g() throws Exception {
        Exception e = new Exception("gn");
        throw e;
    }

    public static void main(String[] args) {
        try {
            f();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
