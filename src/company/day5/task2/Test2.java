package company.day5.task2;

public class Test2 {
    public static void main(String[] args) {
        Employee employee1 = new Employee(12, "Aram", "aaa", 27, 'm');
        Employee employee2 = new Employee(10, "Styop", "bbb", 20, 'm');
        Employee employee3 = new Employee(1, "Elen", "aaa", 35, 'f');
        Employee employee4 = new Employee(19, "Ani", "ggg", 50, 'f');
        Employee employee5 = new Employee(22, "Ashot", "aaa", 18, 'm');
        Employee employee6 = new Employee(120000,12.5f);
        Employee employee7 = new Employee();
        Employee employee8 = new Employee(15,"Vaxo","dep",30,'m',500000,15.1f);

        employee1.infoAbout();
        employee2.infoAbout();
        employee3.infoAbout();
        employee4.infoAbout();
        employee5.infoAbout();
        employee6.infoAbout();
        employee7.infoAbout();
        employee8.infoAbout();


    }
}
