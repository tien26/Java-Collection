package programmer.zaman.now.collection;

import programmer.zaman.now.collection.data.Person;
import programmer.zaman.now.collection.data.PersonComparator;

import java.util.Collections;
import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetApp {
    public static void main(String[] args) {
        SortedSet<Person> people = new TreeSet<>(new PersonComparator().reversed());
        people.add(new Person("saku"));
        people.add(new Person("dia"));
        people.add(new Person("aku"));

        for (var value : people){
            System.out.println(value.getName());
        }

        SortedSet<Person> sortedSet = Collections.unmodifiableSortedSet(people);

//        sortedSet.add(new Person("lala"));error
    }

}
