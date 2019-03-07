public class St {


//    private String name;
//    private double salary;
//    public static

    public static int i;
    public int j;

    public static void s1() {
        St.s2();
        St.i = 1;
    }
    public  static void s2() {}

    public void f1(){
        this.f2();
        St.i = 1;
        this.j = 2;
        St.s1();
    }

    public void f2(){
    }
}
