package Ch10ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExercise {
    public static void main(String[] args){
        Scanner file = new Scanner("data.txt");
        ArrayList<String> words = new ArrayList<String>();
        while(file.hasNext()){
            words.add(file.next());
        }
        System.out.println(words);

    }
}
