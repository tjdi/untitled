package Two2.two;

import java.io.*;

public class Ttt {
    public static void main(String[] args) {
        try(OutputStream out =
                new BufferedOutputStream(
                        new FileOutputStream("GNS3-2.1.11.dmg.copy"));

            InputStream in =
                new BufferedInputStream(
                        new FileInputStream("GNS3-2.1.11.dmg.copy"));) {
            int data;

            long start = System.currentTimeMillis();
            while ((data = in.read()) != -1)
                out.write(data);
            long end = System.currentTimeMillis();

            System.out.println((end - start) /1000);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
