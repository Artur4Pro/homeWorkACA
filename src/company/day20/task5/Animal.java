package company.day20.task5;

public abstract class Animal {

    protected String name;
    protected int age;

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    protected abstract void run();
    protected abstract void voice();

    protected void printInfo(){
        System.out.println(toString());
    }

}
