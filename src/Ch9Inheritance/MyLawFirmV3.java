package Ch9Inheritance;
//This program is a client program to instantiate
//bunch of employees for a law firm
//Print each employee's information
//Employee array. the array is then passed to a method to
//print each employee's information

public class MyLawFirmV3 {
    public static void main(String args[]){
        EmployeeV2[] myEmployees = {new LegalSecretaryV2(), new MarketerV2(),new LawyerV2()};

        printInfo(myEmployees);



    }   public static void printInfo(EmployeeV2[] employee){
        for(EmployeeV2 staff : employee){
            System.out.println("salary: " + staff.getsalary());
            System.out.println("V. Days: " + staff.getVacationDays());
            System.out.println("V. Form: " + staff.getVacactionForm());
            System.out.println();
        }
        /*
            for(int i = 0;i<employee.length;i++) {
                System.out.println("salary: " + employee[i].getsalary());
                System.out.println("V. Days: " + employee[i].getVacationDays());
                System.out.println("V. Form: " + employee[i].getVacactionForm());
                System.out.println();
             }
             */

        }
}
