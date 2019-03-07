package test;

public class Test4 {

    void foo(int i, double... d) {
        System.out.print(i + "");
        for (int j=0; j<d.length; j++)
            System.out.printf("%-3f", d[j]);
    }

    public static void main(String[] args) {

        Test4 t4 = new Test4();
        t4.foo(1);
        System.out.println("\n==============\n");
        t4.foo(1,2,3,4,5,6);
    }
}
