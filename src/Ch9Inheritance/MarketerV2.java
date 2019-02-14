package Ch9Inheritance;

public class MarketerV2 extends EmployeeV2{
    public double getsalary(){
        return super.getsalary()+10000;    //$60,000 a year
    }
    public void advertise(){

        System.out.println("Use Us");
    }
}
