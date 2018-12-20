package Ch8Classes;

public class BankAccountV2 {
    //State Fields Below
    private String name;
    private double balance;
    private String SSN;
    private Ch8Classes.Adress Adress;
    private Dob dob;
    private int pin;
    //Behaviors Below
    public BankAccountV2(String name, String SSN, Adress Adress, Dob dob, double balance, int pin){
        this.name = name;
        this.SSN = SSN;
        this.Adress = Adress;
        this.dob = dob;
        this.balance = balance;
        this.pin = pin;
    }public BankAccountV2(String name, String SSN, String Adress, Dob dob){
        this.name = name;
        this.SSN = SSN;
        this.Adress = Adress;
        this.dob = dob;
    }
    public String getName(){
        return name;
    } public String getSSN(){
        return SSN;
    } public String getdob(){
        return dob;
    }public String Adress(){
        return Adress;
    }
    public String toString(){
        return "Name: " + name + "\nBalance:" + balance;
    }
}
