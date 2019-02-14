package Ch9Inheritance;
//This program is a client program to instantiate
//bunch of employees for a law firm
//Print each employee's information

import java.util.ArrayList;

public class MyLawFirmV2 {
    public static void main(String args[]){
        EmployeeV2[] myEmployees = new EmployeeV2[3];
        EmployeeV2 tom = new LegalSecretaryV2();
        myEmployees[0] = tom;
        EmployeeV2 jonny = new MarketerV2();
        myEmployees[1] = jonny;
        EmployeeV2 henry = new LawyerV2();
        myEmployees[2] = henry;


        printInfo(myEmployees);



    }   public static void printInfo(EmployeeV2[] employee){
        for(int i = 0;i<employee.length;i++) {
            System.out.println("salary: " + employee[i].getsalary());
            System.out.println("V. Days: " + employee[i].getVacationDays());
            System.out.println("V. Form: " + employee[i].getVacactionForm());
            System.out.println();
        }
    }
}
