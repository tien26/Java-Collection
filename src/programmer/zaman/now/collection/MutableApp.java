package programmer.zaman.now.collection;

import programmer.zaman.now.collection.data.Person;

import java.util.List;

public class MutableApp {
    public static void main(String[] args) {
        Person person = new Person("aku");

        person.addhobby("game");
        person.addhobby("coding");

        doSomeThingWithHobbies(person.getHobbies());

        for (var hobby : person.getHobbies()){
            System.out.println(hobby);
        }

    }
    public static void doSomeThingWithHobbies(List<String> hobbies){
        hobbies.add("bukan hobie");
    }
}
