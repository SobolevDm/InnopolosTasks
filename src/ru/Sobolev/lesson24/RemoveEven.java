package ru.Sobolev.lesson24;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveEven {
    public static Set<String> removeEvenLength(Set<String> firstSet) {
        Set<String> newSet = new LinkedHashSet<>();
        for (String entry : firstSet) {
            if (entry.length() % 2 != 0) {
                newSet.add(entry);
            }
        }
        return newSet;
    }

    public static void main(String[] args) {
        String lastString = "foo, bar, spoon, !";//Строка для проверки

        Set<String> firstSet = new LinkedHashSet<String>();
        firstSet.add("foo");
        firstSet.add("buzz");
        firstSet.add("bar");
        firstSet.add("fork");
        firstSet.add("bort");
        firstSet.add("spoon");
        firstSet.add("!");
        firstSet.add("dude");
        System.out.println("Исходное множество:");
        System.out.println(firstSet.toString());

        System.out.println("Новое множество:");
        Set<String> newSet = new LinkedHashSet<>();
        newSet.addAll(RemoveEven.removeEvenLength(firstSet));
        System.out.println(newSet);
        System.out.println("Контрольная строка:");
        System.out.println(lastString);
    }
}
