package programmer.zaman.now.collection;

import java.util.EnumSet;
import java.util.Set;

public class EnumSetApp {
    public static enum Gender{
        MALE,FEMALE,NOT_MENTION
    }

    public static void main(String[] args) {
//        EnumSet<Gender>genders = EnumSet.allOf(Gender.class);
        Set<Gender> genders = EnumSet.of(Gender.FEMALE, Gender.MALE);

        for (var value:genders){
            System.out.println(value);
        }
//        simple
//        Gender[] values = Gender.values();
    }
}
