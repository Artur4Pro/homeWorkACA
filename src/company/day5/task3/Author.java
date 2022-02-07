package company.day5.task3;

public class Author {
    public String name;
    public String email;
    public char gender;

    public Author(String name, String email, char gender) {
        this.name = name;
        this.email = email;
        this.gender = gender;
    }

    public Author(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public void personAllInfo() {
        System.out.println("Author : " + name + " " + email + " " + gender);
    }
}
