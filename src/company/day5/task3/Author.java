package company.day5.task3;

public class Author {
    public String name;
    public String email;
    public char gender;

    public Author(String name, String email , char gender) {
        this.name = name;
        this.email = email;
        this.gender = gender;
    }

    public void write() {
        System.out.println("Author : " + name + " " + email + " " +gender);
    }
}
