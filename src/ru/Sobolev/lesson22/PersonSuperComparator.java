package ru.Sobolev.lesson22;

import java.util.Comparator;

public class PersonSuperComparator implements Comparator<Person> {
    String sortAge = "Сортировка по возрасту:";
    String sortName = "Сортировка по имени";
    String sortNameAge = "Сортировка по имени и возрасту";

    public static void main(String[] args) {
        PersonSuperComparator psc = new PersonSuperComparator();
        Person person1 = new Person("Анна", 15);
        Person person2 = new Person("Максим", 12);
        psc.comparation(person1, person2);
    }

    void comparation(Person obj1, Person obj2) {
        String name1 = obj1.getName();
        String name2 = obj2.getName();

        int age1 = obj1.getAge();
        int age2 = obj2.getAge();
        int comparisonAge;

        if (age1 > age2) {
            comparisonAge = 1;
        } else if (age1 < age2) {
            comparisonAge = -1;
        } else {
            comparisonAge = 0;
        }

        if (name1.compareTo(name2) < 0) {
            System.out.println(sortName);
            System.out.println(obj1);
            System.out.println(obj2);
        } else {
            if (name1.compareTo(name2) > 0) {
                System.out.println(sortName);
                System.out.println(obj2);
                System.out.println(obj1);
            } else {
                if (age1 > age2) {
                    System.out.println(sortNameAge);
                    System.out.println(obj1);
                    System.out.println(obj2);
                } else if (age1 < age2) {
                    System.out.println(sortNameAge);
                    System.out.println(obj2);
                    System.out.println(obj1);
                } else {
                    System.out.println("Люди идентичны по имени и возрасту:");
                    System.out.println(obj1);
                    System.out.println(obj2);
                }
            }
        }

        System.out.println("");
        switch (comparisonAge) {
            case (-1): {
                System.out.println(sortAge);
                System.out.println(obj1);
                System.out.println(obj2);
                break;
            }
            case (0): {
                if (name1.compareTo(name2) < 0) {
                    System.out.println(sortNameAge);
                    System.out.println(obj1);
                    System.out.println(obj2);
                } else if (name1.compareTo(name2) > 0) {
                    System.out.println(sortNameAge);
                    System.out.println(obj2);
                    System.out.println(obj1);
                } else {
                    System.out.println("Люди идентичны по имени и возрасту:");
                    System.out.println(obj1);
                    System.out.println(obj2);
                }
                break;
            }
            case (1): {
                System.out.println(sortAge);
                System.out.println(obj2);
                System.out.println(obj1);
                break;
            }
        }
    }

    @Override
    public int compare(Person o1, Person o2) {
        return 0;
    }
}
