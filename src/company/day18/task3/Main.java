package company.day18.task3;

public class Main {
    public static void main(String[] args) {
        Triangle triangle = new Triangle(15,0,12);
        System.out.println(triangle.check(triangle));
        System.out.println("perimetr " + triangle.perimetr());
    }
}
