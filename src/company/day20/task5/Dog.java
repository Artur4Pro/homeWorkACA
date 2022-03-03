package company.day20.task5;

public class Dog extends Animal {

    public Dog() {
    }

    Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    protected void run() {
        System.out.println("Dog is running");
    }

    @Override
    protected void voice() {
        System.out.println("huuuf");
    }
}
