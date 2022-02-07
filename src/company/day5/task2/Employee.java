package company.day5.task2;

public class Employee {

    int id;
    String name;
    String department;
    int age;
    char gender;

    public Employee(int id, String name, String department, int age, char gender) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.age = age;
        this.gender = gender;
    }

    public void write(){
        System.out.println("Person : " +id+" "+name+" "+department+" "+age+" "+gender);
    }
}
