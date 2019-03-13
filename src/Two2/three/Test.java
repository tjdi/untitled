package Two2.three;

import java.io.*;

public class Test {
    public static void main(String[] args) {

        User tom = new User(1,"Tom");
        User jerry = new User(2,"jerry");

        try(ObjectOutputStream oos = new ObjectOutputStream(
                new BufferedOutputStream(new FileOutputStream("abc"))
        )) {
            oos.writeObject(tom);
            oos.writeObject(jerry);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


class User {
    private Integer id;
    private String name;

    public User(Integer id, String name) {
        this.id = id;
        this.name = name;

    }

}