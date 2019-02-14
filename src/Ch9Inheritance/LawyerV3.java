package Ch9Inheritance;

public class LawyerV3 extends EmployeeV3 {
    //inherit methods from the employee class

    public LawyerV3(String name) {
        super(name);
    }

    //override the inherited methods from the employee class
    public int getVacationDays(){
        return super.getVacationDays()+5;          //2 weeks' paid vacation
    }
    public String getVacactionForm(){
        return "pink";    //use pink form for leave
    }
    public void sue(){System.out.println("I will see you in court");}
}
