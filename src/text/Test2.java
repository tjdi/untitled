package text;

import java.util.Arrays;
import java.util.Comparator;

class UserSort implements Comparable<User>{
    @Override
    public int compareTo(User o) {
        return 0;
    }
}

public class Test2 {
    public static void main(String[] args) throws CloneNotSupportedException{
        User[] users = {};

        Comparator<User> userSort = (o1, o2) ->{
            if (o1.getId() > o2.getId()) return 1;
            else if (o1.getId() == o2.getId()) return 0;
            else return -1;
        };

        Runnable r = ()->{};



        int i = 1;

        Arrays.sort(users, userSort);

    }
}
