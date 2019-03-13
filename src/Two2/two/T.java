package Two2.two;

import java.io.*;

public class T {
    public static void main(String[] args) {
        try(
            OutputStream out = new FileOutputStream("abc");
            InputStream in = new FileInputStream("abc"))  {
            out.write('a');
            out.write(new byte[]{'b','c','d'});
            out.write(new byte[]{'e','f','g'},0,2);

            out.flush();
            System.out.println(in.read());


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
