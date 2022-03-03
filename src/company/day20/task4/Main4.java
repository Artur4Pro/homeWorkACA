package company.day20.task4;

public class Main4 {
    public static void main(String[] args) {
        Shooter shooter = new Shooter();

        shooter.name = "VARDAN";
        shooter.type = "Sharqayin";
        shooter.power = 100;
        shooter.health = 100;

        System.out.println(shooter);
        shooter.hit();

        SwordsMen swordsMen = new SwordsMen();

        swordsMen.name = "SARO";
        swordsMen.type = "General";
        swordsMen.power = 1000;
        swordsMen.health = 100000;

        System.out.println(swordsMen);
        swordsMen.hit();

    }
}
