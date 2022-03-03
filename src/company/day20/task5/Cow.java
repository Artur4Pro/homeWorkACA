package company.day20.task5;

public class Cow extends Animal {

    public Cow() {
    }

    Cow(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    protected void run() {
        System.out.println("Cow is running");
    }

    @Override
    protected void voice() {
        System.out.println("Muuuuuu");
    }
}
