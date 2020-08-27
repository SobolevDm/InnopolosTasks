package ru.Sobolev.lesson25.Task2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Unique {
    private static Map<String, String> FIO = new HashMap();

    static void addFIO() {
        FIO.put("Вася", "Петров");
        FIO.put("Маша", "Ветрова");
        FIO.put("Антон", "Смрнов");
        FIO.put("Сергей", "Демидов");
        FIO.put("Павел", "Овсянников");
        FIO.put("Марина", "Петрова");
        FIO.put("Карина", "Давыдова");
        FIO.put("Денис", "Семёнов");
//        FIO.put("Давид", "Семёнов");
    }

    public static void main(String[] args) {
        addFIO();
        System.out.println(isUnique(FIO));
    }

    public static boolean isUnique(Map<String, String> map) {
        boolean unic = false;

        List<String> list = new ArrayList(map.values());

        String helper = null;
        System.out.println(list);

        for (int i = 0; i < list.size(); i++) {
            helper = list.get(i);
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(j).equals(helper)) {
                    unic = true;
                    break;
                }
            }
            if (unic == true) break;
        }
        return unic;
    }
}
