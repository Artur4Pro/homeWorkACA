package company.day5.task4;

import company.day5.task3.Author;

public class Book {
    Author author;
    String name;
    int price;

    public Book(String name, Author author, int price) {
        this.name = name;
        this.author = author;
        this.price = price;
    }

    public void bookInfo(){
        System.out.println("Book : author : "+author.name + name +" - "+price );
    }

    public void authorInfo(){
        System.out.println("Author name : "+ author.name+", eMail : " +author.email);
    }
}
