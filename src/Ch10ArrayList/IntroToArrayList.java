package Ch10ArrayList;

import java.util.ArrayList;

public class IntroToArrayList {
    public static void main(String[] args) {
        ArrayList<String> students = new ArrayList<String>();
        students.add("Jason");
        students.add("Alex");
        students.add("Noah");
        System.out.println(students);
        students.add(0,"Pizza");
        if(students.contains("Alex")){
            students.remove("Alex");
        }
        System.out.println(students);
        for(int i = 0; i <students.size();i++){
            if(students.get(i).startsWith("M")){
                System.out.println("A student whose name starts with the letter M Exists");
            }
        }



    }

}
