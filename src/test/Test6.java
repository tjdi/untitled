package test;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Test6 {
    public static void main(String[] args)  {


        Class cl = User.class;

        Method[] methods = cl.getMethods();

        for (int i = 0; i < methods.length; i++)

            System.out.println(methods[i]);

        System.out.println("---------------");

        methods = cl.getDeclaredMethods();
        for (Method method : methods)

            System.out.println(method);

    }
}
