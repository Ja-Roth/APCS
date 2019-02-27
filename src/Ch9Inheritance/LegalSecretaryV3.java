package Ch9Inheritance;

public class LegalSecretaryV3 extends SecretaryV3 {
    public LegalSecretaryV3(String name){
        super(name);
    }
    public LegalSecretaryV3(String name,int YOE){
        super(name,YOE);
    }
    public double getSalary(){

        return super.getSalary()+5000;    //$55,000 a year
    }
}
