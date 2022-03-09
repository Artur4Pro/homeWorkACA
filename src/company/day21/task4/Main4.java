package company.day21.task4;

public class Main4 {
    public static void main(String[] args) {

        Shape[] shapes = {new Square(2),
                          new Circle(5),
                          new Rectangle(2, 3)};

        for (Shape shape : shapes) {
            System.out.print("area " + shape.area() + " , ");
            System.out.println("perimetr " + shape.perimeter());
        }

    }
}
