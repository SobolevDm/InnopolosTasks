package ru.Sobolev.lesson17;

import java.io.Serializable;

public class Book implements Serializable {
    private String nameBook, nameAuthor, yearBook;

    public Book(String nameBook, String nameAuthor, String yearBook) {
        this.nameBook = nameBook;
        this.nameAuthor = nameAuthor;
        this.yearBook = yearBook;
    }

    @Override// для консоли
    public String toString() {
        return "Book{" +
                "Название книги: " + nameBook +
                ", Автор: " + nameAuthor +
                ", год издания: " + yearBook +
                '}';
    }

    public String getNameBook() {
        return nameBook;
    }

    public void setNameBook(String nameBook) {
        this.nameBook = nameBook;
    }

    public String getNameAuthor() {
        return nameAuthor;
    }

    public void setNameAuthor(String nameAuthor) {
        this.nameAuthor = nameAuthor;
    }

    public String getYearBook() {
        return yearBook;
    }

    public void setYearBook(String yearBook) {
        this.yearBook = yearBook;
    }
}

