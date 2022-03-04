package company.day21.task2;

public class Person extends Human {

    @Override
    protected int run(int speed) {
        return speed;
    }

    @Override
    protected int run(int speed, boolean isListenMusic) {
        System.out.print("Listening music " + isListenMusic + " and running speed is ");
        return speed;
    }
}
