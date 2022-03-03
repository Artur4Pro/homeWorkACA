package company.day20.task1;

public class Circle extends Shape {
    @Override
    protected double getArea(double radius) {
        return (Math.PI * Math.pow(radius, 2));
    }

    @Override
    protected double getPerimeter(double radius) {
        return (2 * Math.PI * radius);
    }
}
