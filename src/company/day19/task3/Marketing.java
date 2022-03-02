package company.day19.task3;

public class Marketing extends ItCompany {
    protected String departmentName;

    public Marketing() {
    }

    public Marketing(int countOfEmployers, String departmentName) {
        this.countOfEmployers=countOfEmployers;
        this.departmentName = departmentName;
    }

    public void marketing() {
        System.out.println("Marketing");
    }
}
