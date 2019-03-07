package test;

import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Date;

public class Test5 {
    public static void main(String[] args)  {


        Class cl = User.class;
//        Class cl1 = date.getClass();
//        Class cl2 = Class.forName("java.util.Date");

        Field[] fields = cl.getFields();
        for (int i = 0; i < fields.length; i++)

        System.out.println(fields[i]);

        System.out.println("---------------");

        fields = cl.getDeclaredFields();
        for (Field field : fields)

            System.out.println(field);

    }
}
