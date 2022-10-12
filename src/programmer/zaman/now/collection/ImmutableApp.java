package programmer.zaman.now.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ImmutableApp {
    public static void main(String[] args) {
        List<String> one = Collections.singletonList("one");
        List<String> empty = Collections.emptyList();

        List<String> mutable = new ArrayList<>();
        mutable.add("Aku");
        mutable.add("dia");
        List<String> immutable = Collections.unmodifiableList(mutable);

        List<String> elements = List.of("kuku","koko");

    }
}
