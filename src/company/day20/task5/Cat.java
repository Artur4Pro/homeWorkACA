package company.day20.task5;

public class Cat extends Animal{

    public Cat() {
    }

    Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    protected void run() {
        System.out.println("Cat is running");
    }

    @Override
    protected void voice() {
        System.out.println("Mur-mur");
    }
}
