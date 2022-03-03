package company.day20.task5;

public class Main5 {
    public static void main(String[] args) {

        Dog dog = new Dog("Rocky",10);
        dog.printInfo();
        dog.run();
        dog.voice();

        Cat cat = new Cat("Murka",5);
        cat.printInfo();
        cat.run();
        cat.voice();

        Cow cow = new Cow("Caxik",2);
        cow.printInfo();
        cow.run();
        cow.voice();

    }
}
