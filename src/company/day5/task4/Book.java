package company.day5.task4;

import company.day5.task3.Author;

public class Book {
    /**
     * Define Book class which
     * Has  fields name, author, price
     * define all argument constructor
     * write method which will print all information about Book
     * write methods which will print name and email of the author
     * create 2 instances of Book, which has same author
     * print all info about books
     */

    Author author;
    String name;
    int price;

    public Book(String name, Author author, int price) {
        this.name = name;
        this.author = author;
        this.price = price;
    }

    public void info() {
        System.out.println("Book : author : " + author.name + " " + name + " - " + price);
    }

    public void authorInfo() {
        System.out.println("Author name : " + author.name + ", eMail : " + author.email);
    }
}
