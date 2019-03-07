package threeteen;

import java.io.*;
import java.util.Properties;

public class test {
    public static void main(String[] args) throws IOException {
        Properties properties = new Properties();
        properties.setProperty("name","tom");
        properties.setProperty("age","10");

        System.out.println(properties.getProperty("name"));

        OutputStream out = new FileOutputStream("my.properties");
        properties.store(out,"This is a comment");

        Properties db = new Properties();
        db.load(new FileInputStream("db.properties"));
        for (Object key : db.keySet()) {
            System.out.println(key + "=" + db.getProperty((String)key));
        }
    }
}
