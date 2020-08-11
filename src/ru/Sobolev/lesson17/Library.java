package ru.Sobolev.lesson17;

import java.io.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Scanner;

import static ru.Sobolev.lesson17.textColor.*;

public class Library {

    static String path = "./src/ru/Sobolev/lesson17/lib.dat";

    public static Book newBook() throws IOException {
        String scanS;
        String newNameBook = "", newNameAuthor = "", newYearBook = "";

        System.out.println("Введите название новой книги:");
        Scanner scanName = new Scanner(System.in);
        scanS = scanName.nextLine();
        newNameBook = scanS;
        System.out.println("Введите автора книги:");
        Scanner scanAuthor = new Scanner(System.in);
        scanS = scanAuthor.nextLine();
        newNameAuthor = scanS;
        System.out.println("Введите год издания книги:");
        Scanner scanYear = new Scanner(System.in);
        scanS = scanYear.nextLine();
        newYearBook = scanS;
        return new Book(newNameBook, newNameAuthor, newYearBook);
    }

    public static void writeBook(List<Book> b) throws FileNotFoundException {

        try {
            FileOutputStream file = new FileOutputStream(path);
            ObjectOutputStream output = new ObjectOutputStream(file);

            output.writeObject(b);
            output.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<Book> readBook() throws ClassNotFoundException {
        List<Book> newB = new ArrayList<>();

        try {
            FileInputStream fileStream = new FileInputStream(path);
            ObjectInputStream objStream = new ObjectInputStream(fileStream);

            newB.addAll((Collection<? extends Book>) objStream.readObject());
            objStream.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
        return newB;
    }


    public static List<Book> libDel(List<Book> oldB) {
        int i, delNumber = 0;
        boolean exitDel = false;
//        List<Book> newB = new ArrayList<>();
        for (; ; ) {
            System.out.println("Введите номер книги для удаления:");
            Scanner scanName = new Scanner(System.in);
            if (scanName.hasNextInt()) {
                i = scanName.nextInt();
                if (i >= 1 && i <= oldB.size()) {
                    delNumber = i - 1;
                    exitDel = true;
                } else {
                    System.out.printf(tc_RED + "Нужно ввести номер книги, подлежащей удалению." + tc_RESET);
                }
            } else {
                System.out.printf(tc_RED + "Нужно ввести номер книги, подлежащей удалению." + tc_RESET);
            }
            if (exitDel == true) {
                break;
            }
        }
        //перезпись файла
        oldB.remove(delNumber);
        return oldB;
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        boolean exitPo = false;
        List<Book> books = new ArrayList<>();
        File libEx = new File(path);

        if (libEx.exists() != true) {
            System.out.printf(tc_RED + "Библиотека не найдена и будет создана при добавлении новой книги." + tc_RESET + "%n");
        } else {
            books = readBook();
        }

        for (; ; ) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("1. Добавить книгу в библиотеку");
            System.out.println("2. Просмотреть библиотеку");
            System.out.println("3. удалить книгу из библиотеки");
            System.out.println("4. Завершить работу программы");
            if (scanner.hasNextInt()) {
                int scanIn = scanner.nextInt();
                if (scanIn >= 1 && scanIn <= 4) {
                    switch (scanIn) {
                        case (1):   //добавляем книгу в библиотеку
                            if (libEx.exists()) {
                                books.add(newBook());
                                writeBook(books);
                            } else {
                                File newFile = new File(path);
                                newFile.createNewFile();
                                books.add(newBook());
                                writeBook(books);
                            }
                            break;
                        case (2):   //просматриваем библиотеку
                            System.out.println("В библиотеке содержатся следующие книги:");
                            int number = 1;
                            for (Book i : books) {
                                System.out.printf(tc_BLUE + number++ + ": " + i + tc_RESET + "%n");
                            }
                            System.out.println("");
                            break;
                        case (3):   //удаляем книгу из библиотеки
                            books = libDel(books);
                            writeBook(books);
                            //@TODO Перебираем все элементы book и перезаписываем файл

                            break;
                        case (4): // выход из ПО
                            exitPo = true;
                            break;
                    }
                    if (exitPo == true) {
                        break;
                    }
                } else {
                    System.out.println("Введите числа от 1 до 4 согласно пунктам меню.");
                }
            } else {
                System.out.println("Введите числа от 1 до 4 согласно пунктам меню.");
            }
        }//for ()
    }
}