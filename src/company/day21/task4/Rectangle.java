package company.day21.task4;

public class Rectangle implements Shape {

    private int side1, side2;

    public Rectangle(int side1, int side2) {
        this.side1 = side1;
        this.side2 = side2;
    }

    @Override
    public int area() {
        return (side1 * side2);
    }

    @Override
    public double perimeter() {
        return (2 * (side1 + side2));
    }
}
