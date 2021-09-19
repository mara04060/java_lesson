package com.alphabank.work4;


import java.util.Arrays;
import java.util.List;

public class Runner {
    public void run(){

//        List<Integer> intList = Stream.iterate(10, x -> x + 10)
//                .limit(10)
//                .map(x -> x / 2)
//                .collect(Collectors.toList());
//        System.out.println(intList);

//        Stream<String> strs = Stream.of("asdf", "qwery", "badse", "piuy", "Bazxdd", "baba");
//        strs.filter(ss -> ss.startsWith("b") || ss.startsWith("B"))
//                .sorted()
//                .forEach(System.out::println);

        List<Person> people = Arrays.asList(
                new Person("Ivan", 20, "male"),
                new Person("Dariia", 23, "female"),
                new Person("Ihor", 28, "male"),
                new Person("Denys", 17, "male"),
                new Person("Hanna", 44, "female"),
                new Person("Peter", 25, "male"));

        people.stream()
                .filter(x -> x.getGender().equalsIgnoreCase("male") && x.getAge() >= 18 && x.getAge() <= 27)
                .forEach(System.out::println);

        double avg = people.stream()
                .filter(p -> p.getGender().equalsIgnoreCase("female"))
                .mapToInt(p -> p.getAge())
                .average()
                .getAsDouble();
        System.out.println(avg);
    }
}
