package company.day5.task3;

public class Author {
    /**
     * Define Author class which
     * Has  fields name, email, gender
     * define all argument constructor
     * write method which will print all information about  Author
     * create an instance of Author and print all info about him
     */
    
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
