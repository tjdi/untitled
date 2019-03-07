package test;

import java.lang.reflect.Constructor;

public class Test7 {
    public static void main(String[] args) {

        Class cl = User.class;
        Constructor[] constructors = cl.getConstructors();
        for (int i = 0; i < constructors.length; i++)
            System.out.println(constructors[i]);

        System.out.println("----------------------");

        constructors = cl.getDeclaredConstructors();
        for (Constructor constructor : constructors)
            System.out.println(constructor);

    }
}
