package company.day19.task3;

public class FinancialAccount extends TaxAccounting {

    public FinancialAccount() {
    }

    public FinancialAccount(int countOfEmployers, String departmentName) {
        super(countOfEmployers, departmentName);
    }

    @Override
    public void account() {
        System.out.println("FinancialAccount");
    }
}
