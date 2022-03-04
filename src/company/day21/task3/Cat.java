package company.day21.task3;

public class Cat extends Animal {

    public Cat(String name, int age) {
        super(name, age);
    }

    @Override
    void sound() {
        System.out.println("Myauuu");
    }
}
