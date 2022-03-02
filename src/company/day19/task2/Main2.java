package company.day19.task2;

public class Main2 {
    public static void main(String[] args) {


        Accounting accounting = new Accounting();
        accounting.account();

        Accounting accounting1 = new TaxAccounting();
        accounting1.account();

        Accounting accounting2 = new FinancialAccount();
        accounting2.account();

        TaxAccounting taxAccounting = new TaxAccounting();
        taxAccounting.account();

        TaxAccounting taxAccounting1 = new FinancialAccount();
        taxAccounting.account();

        FinancialAccount financialAccount = new FinancialAccount();
        financialAccount.account();

    }
}
