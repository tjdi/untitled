package test;

import java.util.Arrays;

public class User implements Comparable<User>{
    private int id;
    private String name;

    public User(int id, String name){
        this.id = id;
        this.name = name;
    }

    @Override
    public int compareTo(User o) {
        if (this.id > o.id) return 1;
        else if (this.id == o.id) return 0;
        else return -1;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
class Test{
    public static void main(String[] args) {
        User tom = new User(1,"Tom");
        User ben = new User(3,"Ben");
        User jerry = new User(2,"Jerry");
        User[] users = {tom,ben,jerry};
        Arrays.sort(users);
        Arrays.stream(users).forEach(System.out::println);
    }
}
