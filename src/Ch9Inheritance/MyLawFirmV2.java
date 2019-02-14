package Ch9Inheritance;
//This program is a client program to instantiate
//bunch of employees for a law firm

public class MyLawFirmV2 {
    public static void main(String args[]){
        EmployeeV2 tom = new LegalSecretaryV2();
        EmployeeV2 johnny = new MarketerV2();
        EmployeeV2 henry = new LawyerV2();
        printInfo(tom);
        printInfo(johnny);
        printInfo(henry);


    }   public static void printInfo(EmployeeV2 employee){
        System.out.println("salary: " +employee.getsalary());
        System.out.println("V. Days: " +employee.getVacationDays());
        System.out.println("V. Form: " +employee.getVacactionForm());
        System.out.println();
    }
}
