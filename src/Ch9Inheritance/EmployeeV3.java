//this is a class to represent employees in general (20 page manual)
package Ch9Inheritance;

public class EmployeeV3 {
    //state fields
    String name;
    public EmployeeV3(String name){
        this.name = name;
    }

    public int getHours(){
        return 40;
    }
    public double getSalary(){
        return 50000.00;
    }
    public int getVacationDays(){
        return 10;          //2 weeks' paid vacation
    }
    public String getVacactionForm(){
        return "yellow";    //use yellow form for leave
    }

}
