package company.day21.task1;

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

    protected abstract void voice();

    protected void printInfo(){
        System.out.println(toString());
    }

}
