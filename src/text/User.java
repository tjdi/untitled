package text;

import java.util.Arrays;
import java.util.Comparator;


public class User{
    private int id;
    private String name;

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public User(int id, String name){
        this.id = id;
        this.name = name;
    }
    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}

class UserOrder implements Comparator<User>{
    @Override
    public int compare(User o1, User o2) {
        if (o1.getId() > o2.getId()) return 1;
        else if (o1.getId() > o2.getId()) return 0;
        else return -1;
    }
}


class Test{
    public static void main(String[] args) {
        User tom = new User(1,"Tom");
        User ben = new User(3,"Ben");
        User jerry = new User(2,"Jerry");
        User[] users = {tom,ben,jerry};
        Arrays.sort(users,new UserOrder());

        Arrays.stream(users).forEach(System.out::println);
    }
}
