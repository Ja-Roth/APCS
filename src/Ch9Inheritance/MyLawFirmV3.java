package Ch9Inheritance;
//This program is a client program to instantiate
//bunch of employees for a law firm
//Print each employee's information
//Employee array. the array is then passed to a method to
//print each employee's information

public class MyLawFirmV3 {
    public static void main(String args[]){
        EmployeeV3[] myEmployees = {new LegalSecretaryV3("Tom"), new MarketerV3("Jonny"),new LawyerV3("Henry")};

        printInfo(myEmployees);



    }   public static void printInfo(EmployeeV3[] employee){

        //for each loop
        //data type  //iterator //container
        for(EmployeeV3 staff : employee){
            System.out.println("salary: " + staff.getSalary());
            System.out.println("V. Days: " + staff.getVacationDays());
            System.out.println("V. Form: " + staff.getVacactionForm());
            System.out.println();
        }
    }
}
