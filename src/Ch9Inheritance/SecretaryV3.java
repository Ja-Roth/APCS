package Ch9Inheritance;

public class SecretaryV3 extends EmployeeV3 {
    public SecretaryV3(String name) {
        super(name);
    }
    public SecretaryV3(String name,int YOE){
        super(name,YOE);
    }

    public void takeDiction(String texts){

        System.out.println("Taking dictation of text: "+texts);
    }
}
