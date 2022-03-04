package company.day21.task4;

public class Circle implements Shape {

     private int r;

    public Circle(int r) {
        this.r = r;
    }

    @Override
    public int area() {
        return (int) (Math.PI * Math.pow(r, 2));
    }

    @Override
    public double perimeter() {
        return (2 * r);
    }
}
