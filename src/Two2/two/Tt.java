package Two2.two;

import java.io.*;
import java.util.Arrays;

public class Tt {
    public static void main(String[] args) {
        try (
            OutputStream out = new FileOutputStream("abc");
            InputStream in = new FileInputStream("abc")) {
            out.write('a');
            out.write(new byte[]{'b','c','d'});
            out.write(new byte[]{'e','f','g',0,2});
            System.out.println((char)in.read());
            byte[] bytes = new byte[3];
            in.read(bytes);
            System.out.println(new String(bytes));
            byte[] bytes1 =new byte[10];
            Arrays.fill(bytes1,(byte)'Z');
            in.read(bytes1,3,2);
            System.out.println(new String(bytes1));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
