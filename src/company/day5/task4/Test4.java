package company.day5.task4;

import company.day5.task3.Author;

public class Test4 {
    public static void main(String[] args) {

        Author author = new Author("Martiros", "Martiros@gmail.com");

        Book book = new Book("Dream", author, 1900);
        Book book1 = new Book("Aprel", author, 9000);

        book.bookInfo();
        book.authorInfo();
        book1.bookInfo();
        book1.authorInfo();
    }
}
