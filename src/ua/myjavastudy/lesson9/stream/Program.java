package ua.myjavastudy.lesson9.stream;

import java.util.ArrayList;
import java.util.List;

public class Program {

    public static void main (String[] args) {
        List <Person> persons = new ArrayList<>();
        persons.add(new Person("Сергей", 38));
        persons.add(new Person("Даша", 7));
        persons.add(new Person("Глаша", 3));
        persons.add(new Person("Саша", 6));
        persons.add(new Person("Анна", 18));


        double averageAge2 = persons.stream().
                filter(p -> p.getAge() >= 18).
                mapToInt( p -> p.getAge()).
                average().getAsDouble();
        System.out.println(averageAge2);


//        for(Person p : persons) {
//            System.out.println(p);
//        }

//      persons.stream().forEach(p -> System.out.println(p));
//      persons.stream().forEach(System.out::println);
        persons.stream().
                filter(p -> p.getAge() >= 18).
                sorted( (p1, p2) -> p1.getName().compareTo(p2.getName())).
                map( p -> p.getName()).
                forEach(System.out::println);
    }
}
