package ru.Sobolev.lesson18;

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

        try {
            File fRead = new File("first.txt");

            InputStreamReader inStr = new InputStreamReader(new FileInputStream("first.txt"), "UTF-8");
            BufferedReader reader = new BufferedReader(inStr);

            String bufer = reader.readLine();
            System.out.println(bufer);

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
