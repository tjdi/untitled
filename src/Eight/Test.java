package Eight;

class ArrayAlg {
    public static <T> T getMiddle(T... a) {
        return a[a.length / 2];
    }
    public static <T extends Comparable> T min(T[] a) {
        if (a == null || a.length == 0) return null;
        T smallest = a[0];
        for (int i = 1; i < a.length; i++)
            if (smallest.compareTo(a[i]) > 0) smallest = a[i];
        return smallest;
    }
}

public class Test {
    public static void main(String[] args) {
        ArrayAlg.<String>min(new String[]{"aa","b"});
        class User implements Comparable<User>{
            @Override
            public int compareTo(User o) {
                return 0;
            }
        }
        ArrayAlg.<User>min(new User[]{});
    }
}
