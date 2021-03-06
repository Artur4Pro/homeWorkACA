package company.day5.task2;

public class Employee {
    /**
     * 2․Define Employee class which
     * Has  fields id, name, department, age, gender
     * define all argument constructor
     * write method which will print all information about employee
     * create 5 employee objects(3 male and 2 female)
     * 3 of them are working in same department
     * print all info about them
     */

    int id;
    String name;
    String department;
    int age;
    char gender;

    int salary;
    float rating;
    static  int count;

    public Employee() {
        count++;
    }

    public Employee(int salary, float rating) {
        this.salary = salary;
        this.rating = rating;
        count++;
    }

    public Employee(int id, String name, String department, int age, char gender, int salary, float rating) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.age = age;
        this.gender = gender;
        this.salary = salary;
        this.rating = rating;
        count++;
    }



    public Employee(int id, String name, String department, int age, char gender) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.age = age;
        this.gender = gender;
        count++;
    }

    public void infoAbout() {
        System.out.println("Person : {" + id + " " + name + " " + department + " " + age + " " + gender + " " + salary + " " +rating + "   " + count+" }");
    }
}
