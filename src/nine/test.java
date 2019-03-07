package nine;

import javax.swing.text.html.HTMLDocument;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class test {
    public static void main(String[] args) {
        Collection<String> list = new ArrayList<>();
        list.add("abc");
        list.add("def");

        list.forEach(System.out::println);

        for (String s : list)
            System.out.println(s);

        Iterator<String> it = list.iterator();

        while (it.hasNext())
            System.out.println(it.next());

    }
}
