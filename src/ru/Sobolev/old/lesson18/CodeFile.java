package ru.Sobolev.old.lesson18;

import java.io.*;

public class CodeFile {
    public static void main(String[] args) throws IOException {
        File fFile = new File("first.txt");
        fFile.createNewFile();
        FileWriter strW = new FileWriter(fFile);
        strW.append("Hello world!\n");
        strW.append("This is file code UTF-8?\n\n");
        strW.append("Посмотрим как ляжет кирилица в новый файл с иной кодировкой.\n");
        strW.close();

        InputStreamReader isr = new InputStreamReader(new FileInputStream("first.txt"), "UTF-8");
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("second.txt"), "cp1251");

        while (isr.ready()) {
            osw.write(isr.read());
        }
        isr.close();
        osw.close();
    }
}
