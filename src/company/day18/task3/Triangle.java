package company.day18.task3;

public class Triangle {

    private int sideA;
    private int sideB;
    private int sideC;

    public Triangle(int sideA, int sideB, int sideC) {
        this.setSideA(sideA);
        this.setSideB(sideB);
        this.setSideC(sideC);
    }

    public int getSideA() {
        return sideA;
    }

    public void setSideA(int sideA) {
        if (sideA<1 || sideA>20){
            System.out.println("invalid side");
        }else {this.sideA = sideA;}
    }

    public int getSideB() {
        return sideB;
    }

    public void setSideB(int sideB) {
        if (sideB<1 || sideB>20){
            System.out.println("invalid side");
        }else {this.sideB = sideB;}
    }

    public int getSideC() {
        return sideC;
    }

    public void setSideC(int sideC) {
        if (sideC<1 || sideC>20){
            System.out.println("invalid side");
        }else {this.sideC = sideC;}
    }

    private boolean isTriangleValid() {
        return ((sideA + sideB) > sideC || (sideA + sideC) > sideB || (sideC + sideB) > sideA);
    }

    public boolean check(Triangle triangle) {
        return isTriangleValid();
    }

    private int isSquare() {
        if (sideA * sideA == sideB * sideB + sideC * sideC||sideC==sideB) {
            return 1; // true , if sideA is Nerqnadziq
        } else if (sideB * sideB == sideC * sideC + sideA * sideA||sideC==sideA) {
            return 2;// true , if sideB is Nerqnadziq
        } else if (sideC * sideC == sideB * sideB + sideA * sideA||sideB==sideA) {
            return 3;// true , if sideC is Nerqnadziq
        } else {
            return -1;
        }
    }

    public int perimetr() {
        int isSquare = isSquare();
        int perimetr = 0;
        switch (isSquare) {
            case 1:
                perimetr = 2 * sideB + 2 * sideC;
                break;
            case 2:
                perimetr = 2 * sideC + 2 * sideA;
                break;
            case 3:
                perimetr = 2 * sideB + 2 * sideA;
                break;
            default:
                System.out.println("triangle count is not squar");
        }
        return perimetr;
    }


}
