package programmer.zaman.now.collection;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class ImmutableSetApp {
    public static void main(String[] args) {
        Set<String> empty = Collections.emptySet();
        Set<String> one = Collections.singleton("aku");

        Set<String> mutable = new HashSet<>();
        mutable.add("aku");
        mutable.add("saya");
        Set<String>immutable = Collections.unmodifiableSet(mutable);

        Set<String> set = Set.of("Aku","Kamu");

//        set.add("ada");error
//        set.remove("Aku"); error
    }
}
