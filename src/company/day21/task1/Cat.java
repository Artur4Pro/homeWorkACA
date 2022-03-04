package company.day21.task1;

public class Cat extends Animal {

    public Cat() {
    }

    Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    protected void voice() {
        System.out.println("Mur-mur");
    }
}
