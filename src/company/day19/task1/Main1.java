package company.day19.task1;

public class Main1 {
    public static void main(String[] args) {

        Animal animal = new Animal();
        animal.voice();
        animal.eat();

        Dog dog = new Dog();
        dog.voice();
        dog.eat();

        Animal animal1 = new Dog();
        animal1.voice();
        animal1.eat();

    }
}
