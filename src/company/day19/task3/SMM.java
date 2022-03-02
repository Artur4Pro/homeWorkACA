package company.day19.task3;

public class SMM extends Marketing{

    public SMM() {
    }

    public SMM(int countOfEmployers, String companyName) {
        super(countOfEmployers, companyName);
    }

    @Override
    public void marketing() {
        System.out.println("SMM");
    }
}
