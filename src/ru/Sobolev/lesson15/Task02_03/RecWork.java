package ru.Sobolev.lesson15.Task02_03;

import java.io.File;
import java.io.IOException;

public class RecWork {

    public static void CreatFile(String s) throws IOException {
        File dir1 = new File(s + "/Temp");
        dir1.mkdirs();
        File file1 = new File(dir1.getAbsolutePath() + "/ini.txt");
        file1.createNewFile();
        File dir2 = new File(s + "/RecTest");
        dir2.mkdirs();
        File dir3 = new File(dir2.getAbsolutePath() + "/base");
        dir3.mkdirs();
        File file2 = new File(dir2.getAbsolutePath() + "/data.txt");
        file2.createNewFile();
        File file3 = new File(dir2.getAbsolutePath() + "/system.dod");
        file3.createNewFile();
        File file4 = new File(dir3.getAbsolutePath() + "/readme.txt");
        file4.createNewFile();
    }

    public static void view(String s, String depth) {
        File dir = new File(s);
        for (File path : dir.listFiles()) {
            if (path.isDirectory()) {
                System.out.println(depth + path.getName());
                view(path.getAbsolutePath(), depth + " ");
            } else {
                System.out.println(depth + "[" + path.getName() + "]");
            }
        }
    }

    public static void delFiles(String s) {
        File dir = new File(s);
        for (File path : dir.listFiles()) {
            if (path.listFiles() != null) {
                if (path.isDirectory()) {
                    delFiles(path.getAbsolutePath());
                }
                path.delete();
            }
            dir.delete();
        }
    }


    public static void main(String[] args) throws IOException {
        String str = "/Users/sobolev/Documents/developer/TestApplication/src/ru/Sobolev/lesson15/Task02_03/Delete";
//        CreatFile(str);
        view(str, "");


    }
}
