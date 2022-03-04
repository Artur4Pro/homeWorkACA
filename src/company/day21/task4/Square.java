package company.day21.task4;

public class Square implements Shape{
    private int side;

    public Square(int side) {
        this.side = side;
    }

    @Override
    public int area() {
        return (side * side);
    }

    @Override
    public double perimeter() {
        return 2*(side+side);
    }
}
