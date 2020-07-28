package ru.Sobolev.lesson15.Task01;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class WorkFile {
    public static void main(String[] args) throws Exception {
        String str = "/Users/sobolev/Documents/developer/TestApplication/src/ru/Sobolev/lesson15/Task01";
//        String str ="./";
        File file = new File(str, "MyFile.txt");
        file.createNewFile();
        System.out.println(file.getAbsolutePath());
        System.out.println("Создан файл: " + file.getName());
        File fileNew = new File(str, "NewMyFile.txt");
        file.renameTo(fileNew);
        System.out.println("Новое название файла: " + fileNew.getName());
        File dir = new File(str + "/data");
        dir.mkdir();
        System.out.println("Создана папка: " + dir.getName());
        //копирование файла
        String str1 = str + "/" + fileNew.getName(), str2 = str + "/data/" + fileNew.getName();
        Files.copy(Paths.get(str1), Paths.get(str2), StandardCopyOption.REPLACE_EXISTING);
        System.out.println("Скопирован файл: " + str2);
        Files.delete(Paths.get(str2));
        System.out.println("Файл " + fileNew.getName() + " удален.");
        //Очистка Task01 в каталоге lesson15
        Files.delete(Paths.get(str1));
        System.out.println("Файл " + file.getName() + " удален.");
        Files.delete(Paths.get(str + "/data"));
        System.out.println("Папка data удалена");
    }
}
