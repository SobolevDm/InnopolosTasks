package ru.Sobolev.lesson33;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StringLenght {

    public static void main(String[] args) {

        Map<Character, Integer> chars = new HashMap();
        List<Character> charsMax = new ArrayList<>();

        String string = "Ми-Ми-Мишки очень любят мёд!";
        Character maximum = null;

        for (char i : string.toLowerCase().toCharArray()) {
            if (chars.get(i) == null) {
                chars.put(i, 1);
                if (maximum == null) {
                    maximum = i;
                }
            } else {
                chars.put(i, chars.get(i) + 1);
                if (chars.get(i) == chars.get(maximum)) {
                    charsMax.add(i);
                }
                if (chars.get(i) > chars.get(maximum)) {
                    maximum = i;
                    charsMax.clear();
                    charsMax.add(i);
                }
            }
        }
//        if (charsMax == null) {
//            System.out.println("Символ '" + maximum + "' встречается " + chars.get(maximum) + " раз(а).");
//        } else {
        System.out.printf("Символ(ы):");
        for (Character j : charsMax) {
            System.out.printf(" '" + j + "'");
        }
        System.out.println(", встречаются " + chars.get(maximum) + " раз(а).");
//        }
    }
}
