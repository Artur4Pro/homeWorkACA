package company.day19.task3;

public class Accounting extends ItCompany {
    protected String departmentName;

    public Accounting() {
    }

    public Accounting(int countOfEmployers, String departmentName) {
        this.countOfEmployers=countOfEmployers;
        this.departmentName = departmentName;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    @Override
    public void account() {
        System.out.println("Accounting");
    }
}
