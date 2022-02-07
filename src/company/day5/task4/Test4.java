package company.day5.task4;

import company.day5.task3.Author;

public class Test4 {
    public static void main(String[] args) {
        Book book = new Book("Dream",new Author("Martiros","Martiros@gmail.com"),1900);
        Book book1 = new Book("Aprel",new Author("Sevak","Sevak@gmail.com"),9000);

        book.bookInfo();
        book.authorInfo();
        book1.bookInfo();
        book1.authorInfo();
    }
}
