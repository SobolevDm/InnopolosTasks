package ru.Sobolev.lesson29;

import java.util.*;

import static ru.Sobolev.textColor.*;

public class ClassHashMap {

    public static Map<String, Person> createMap() {
        Map<String, Person> book = new HashMap<>();
        Person person1 = new Person(29, "Петрова", "жен");
        Person person2 = new Person(34, "Сидорова", "жен");
        Person person3 = new Person(34, "Тихонова", "жен");
        Person person4 = new Person(35, "Петров", "муж");
        book.put("Key1", person1);
        book.put("Key2", person1);
        book.put("Key3", person2);
        book.put("Key4", person3);
        book.put("Key5", person4);
        book.put("Key6", person4);
        return book;
    }

    public static void removeTheDuplicates(Map<String, Person> map) {
        Set<Person> set = new HashSet<>();
        Iterator<Map.Entry<String, Person>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Person> entry = iterator.next();
            if (!set.add(entry.getValue())) {
                iterator.remove();
            }
        }
    }

    public static void removeItemFromMapByValue(Map<String, Person> map, Person value) {
        Map<String, Person> copy = new HashMap<>(map);
        for (Map.Entry<String, Person> pair : copy.entrySet()) {
            if (pair.getValue().equals(value))
                map.remove(pair.getKey());
        }
    }

    public static void main(String[] args) {
        Map<String, Person> books = createMap();
        System.out.printf(tc_BLUE + "Исходная Мапа:%n");
        for (Map.Entry<String, Person> entry : books.entrySet()) {
            System.out.println(entry.toString());
        }
        System.out.printf("" + tc_RESET);
        removeTheDuplicates(books);

        System.out.printf(tc_RED + "%nИтоговая Мапа:%n");
        for (Map.Entry<String, Person> entry : books.entrySet()) {
            System.out.println(entry.toString());
        }
        System.out.println("" + tc_RESET);
    }
}
