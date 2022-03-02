package company.day19.task3;

public class Main3 {
    public static void main(String[] args) {

        ItCompany itCompany = new ItCompany();
        itCompany.account();

        ItCompany itCompany1 = new Accounting();
        itCompany1.account();

        ItCompany itCompany2 = new TaxAccounting();
        itCompany2.account();

        ItCompany itCompany3 = new FinancialAccount();
        itCompany3.account();

        Marketing marketing = new Marketing();
        marketing.marketing();

        Marketing marketing1 = new SMM();
        marketing1.marketing();

        Marketing marketing2 = new SEO();
        marketing2.marketing();

    }
}
