package test;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Date;

public class Java4_2_1 {
    public static void main(String[] args) {

//4.2.1        int i = 1;
//        System.out.println(i);
//
//        Date birthday = new Date();
//        System.out.println(birthday);
//
//        Date deadline = null;
//
//        deadline = birthday;
        LocalDate now = LocalDate.now();
        System.out.println(now);

        LocalDate localDate
                = LocalDate.of(1990,05,17);
        System.out.println(localDate);

        System.out.println();
  }
}


