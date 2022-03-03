package company.day20.task4;

public abstract class Warrior {

    protected String name, type;
    protected int power, health;

    abstract void hit();

    @Override
    public String toString() {
        return "Warrior{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", power=" + power +
                ", health=" + health +
                '}';
    }
}
