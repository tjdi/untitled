package Two2.two;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.stream.Stream;

public class Tttt {
    public static void main(String[] args) throws IOException {
        String content =
                new String(Files.readAllBytes(Path.of("abc")));

        System.out.println(content);

        try(Stream<String> lines = Files.lines(Path.of("abc"), Charset.defaultCharset())){
            lines.forEach(System.out::println);
        }
    }
}
