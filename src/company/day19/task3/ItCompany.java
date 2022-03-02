package company.day19.task3;

public class ItCompany {
    protected int countOfEmployers;
    private String companyName;

    public ItCompany() {
    }

    public ItCompany(int countOfEmployers, String companyName) {
        this.countOfEmployers = countOfEmployers;
        this.companyName = companyName;
    }

    public int getCountOfEmployers() {
        return countOfEmployers;
    }

    public void setCountOfEmployers(int countOfEmployers) {
        this.countOfEmployers = countOfEmployers;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public void account() {
        System.out.println("ItCompany");
    }
}
