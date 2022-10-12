package programmer.zaman.now.collection;

import java.util.Arrays;
import java.util.List;

public class ArrayApp {
    public static void main(String[] args) {
        List<String> names = List.of("Eko","kau","kaka");

        Object[] obj = names.toArray();
        String[] string = names.toArray(new String[]{});

        System.out.println(Arrays.toString(obj));
        System.out.println(Arrays.toString(string));
    }
}
