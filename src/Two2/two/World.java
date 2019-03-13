package Two2.two;

import java.io.*;

public class World {
    public static void main(String[] args) {
        try (
            OutputStream out = new FileOutputStream("abc");
            InputStream in =new FileInputStream("abc")) {
            out.write('a');
            out.write('b');
            out.flush();
            System.out.println((char)in.read());
            System.out.println((char)in.read());
            } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
