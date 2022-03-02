package company.day19.task3;

public class SEO extends SMM {
    public SEO() {
    }

    public SEO(int countOfEmployers, String companyName) {
        super(countOfEmployers, companyName);
    }

    @Override
    public void marketing() {
        System.out.println("SEO");
    }
}
