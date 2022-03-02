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

        ItCompany itCompany4 = new Marketing();
        //itCompany4.marketing(); chi tesnum vorovhetevc parent classy chi tesnum jarangi metody

        ItCompany itCompany5 = new SMM();
        //itCompany5.marketing(); chi tesnum vorovhetevc parent classy chi tesnum jarangi metody

        ItCompany itCompany6 = new SEO();
        //itCompany6.marketing(); chi tesnum vorovhetevc parent classy chi tesnum jarangi metody


        System.out.println("___________________________________");

        Accounting accounting = new Accounting();
        accounting.account();

        Accounting accounting1 = new TaxAccounting();
        accounting1.account();

        Accounting accounting2 = new FinancialAccount();
        accounting2.account();

        System.out.println("___________________________________");

        TaxAccounting taxAccounting = new TaxAccounting();
        taxAccounting.account();

        TaxAccounting taxAccounting1 = new FinancialAccount();
        taxAccounting1.account();

        System.out.println("___________________________________");

        FinancialAccount financialAccount = new FinancialAccount();
        financialAccount.account();

        System.out.println("___________________________________");

        Marketing marketing = new Marketing();
        marketing.marketing();

        Marketing marketing1 = new SMM();
        marketing1.marketing();

        Marketing marketing2 = new SEO();
        marketing2.marketing();

        System.out.println("___________________________________");

        SMM smm = new SMM();
        smm.marketing();

        SMM smm1 = new SEO();
        smm1.marketing();

        System.out.println("___________________________________");

        SEO seo = new SEO();
        seo.marketing();

    }
}
