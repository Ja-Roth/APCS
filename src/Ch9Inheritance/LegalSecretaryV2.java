package Ch9Inheritance;

public class LegalSecretaryV2 extends SecretaryV2 {
    public double getsalary(){

        return super.getsalary()+5000;    //$55,000 a year
    }
}
