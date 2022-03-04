package company.day21.task1;

public class Horse extends Animal {

    public Horse() {
    }

    Horse(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    protected void voice() {
        System.out.println("Iiiiii hi hi hi hi");
    }
}
