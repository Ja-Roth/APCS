package Ch10ArrayList;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExercise {
    public static void main(String[] args)throws FileNotFoundException {
        Scanner io = new Scanner(new File("data.txt"));
        ArrayList<String> words = new ArrayList<String>();
        while(io.hasNext()){
            words.add(io.nextLine());
        }
        System.out.println(words);

    }
}
