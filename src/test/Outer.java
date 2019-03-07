package test;

class Outer {

    public void f() {}
    private int i = 1;

    public static class Innner{
        public void g() {
        }
    }

    public static void main(String[] args) {
        Outer.Innner innner = new Outer.Innner();

    }
}
