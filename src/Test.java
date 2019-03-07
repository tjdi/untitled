public class Test {

//    void fun() {
//        System.out.println("1234567890");
//        return;
//    }
//
//
//    int goo() {
//        System.out.println("1234567890");
//        return 1;
//    }
//
//    double zoo(int d) {
//        return d + 1.0;
//    }
//
//    public static void main(String[] args) {
//        Test t = new Test();
//        t.fun();
//        System.out.println(t.goo());
//        System.out.println(t.zoo(1));
//    }

//    public static void main(String[] args) {
//        St tom = new St("tom",1000);
//        tom.
//    }

     /*1 void goo(){}

    int foo(int i,double d){
              System.out.println("foo:" + i + d);
        return 1;
//    }
//
//    void goo() {
//        System.out.println("f00");
//        return;
    }

    public static void main(String[] args) {

        Test t = new Test();
        int i = t.foo(2,1);
        t.foo(2,2);
        System.out.println(t.foo(3,3));
        t.goo();
    }
    */

    double foo(int i, double d) {
        i = i + 1;     //2
        d = d + 1;     //3
        return i + d;  //5
    }


    public static void main(String[] args) {
        Test t = new Test();
        int i = 1;
        double d = 2;
        System.out.println("foo:" + t.foo(i, d));
        System.out.printf("i=%d, j=%f", i, d);
    }


//    public static void main(String[] args) {
//        Employee tom = new Employee("tom",1000);
//
//        tom.setSalary(-1000);
//        System.out.println(tom.setSalary(10));
//    }
//

}