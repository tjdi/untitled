package test;

interface B {
    default void foo() {
        System.out.println("b");
    }
}

interface C {
    default void foo() {
        System.out.println("c");
    }
}

class Test9{
    public void foo() {
        System.out.println("test9");
    }
}

public class Test8 extends Test9 implements C,B{
}
