package ru.Sobolev.lesson22;

import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;

public class PersonSuperComparator implements Comparator<Person> {
    public static void main(String[] args) {
        SortedSet<Person> persons = new TreeSet();
        persons.add(new Person("Анна", 10));
        persons.add(new Person("Фёдор", 12));
        persons.add(new Person("Данил", 15));
        System.out.println("Исходные данные:");
        for (Person person : persons) {
            System.out.println(person.toString());
        }

        System.out.printf("%nРеализуем интерфейс compare по ТЗ:%n");
        persons = new TreeSet(new PersonSuperComparator());
        persons.add(new Person("Анна", 10));
        persons.add(new Person("Фёдор", 12));
        persons.add(new Person("Данил", 15));
        for (Person person : persons) {
            System.out.println(person.toString());
        }
    }

    @Override
    public int compare(Person o1, Person o2) {
        String name1 = o1.getName();
        String name2 = o2.getName();
        int age1 = o1.getAge();
        int age2 = o2.getAge();
        int intName = 0, i;

        if (name1.compareTo(name2) < 0) {
            intName = -1;
        }
        if (name1.compareTo(name2) > 0) {
            intName = 1;
        }
        if (name1.compareTo(name2) == 0) {
            intName = 0;
        }

        if (age1 > age2) {
            i = intName;
        } else if (age1 < age2) {
            if (intName == -1) {
                i = -1;
            } else {
                i = 1;
            }
        } else {
            i = 0;
        }
        return i;
    }
}
