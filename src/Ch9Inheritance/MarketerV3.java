package Ch9Inheritance;

public class MarketerV3 extends EmployeeV3{
    public MarketerV3(String name) {
        super(name);
    }

    public double getSalary(){
        return super.getSalary()+10000;    //$60,000 a year
    }
    public void advertise(){

        System.out.println("Use Us");
    }
}
