package test;

import java.io.Serializable;

public interface Usb extends Bus, Serializable {
}

interface Bus {

    public abstract void foo();

    public static final int a = 1;

    public static void goo(){
        System.out.println("goo.......");
    }

    public default void hoo(){
        System.out.println("hoo.......");
    }
}

class Computer implements Usb, Bus{
    @Override
    public void foo() {

    }
}

class Test10{
    public static void main(String[] args) {
        Bus.goo();
        Computer computer = new Computer();
        computer.hoo();

    }
}
