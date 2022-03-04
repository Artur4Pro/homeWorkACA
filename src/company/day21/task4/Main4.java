package company.day21.task4;

public class Main4 {
    public static void main(String[] args) {

        Shape[] shapes = {new Square(2),
                          new Circle(5),
                          new Rectangle(2, 3)};

        for (int i = 0; i < shapes.length; i++) {
            System.out.print("area " + shapes[i].area() + " , ");
            System.out.println("perimetr " + shapes[i].perimeter());
        }

    }
}
