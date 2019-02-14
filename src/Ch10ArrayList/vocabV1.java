package Ch10ArrayList;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class vocabV1 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner input1 = new Scanner(new File("text1.txt"));
        Scanner input2 = new Scanner(new File("text2.txt"));
        ArrayList<String> list1 = getWords(input1);
        ArrayList<String> list2 = getWords(input2);
        System.out.println(list1);
        System.out.println(list2);
        ArrayList<String> common = getOverlap(list1,list2);
        //System.out.println(stopWordDeleter());
        double list1Percent = getPercentOverlap(common,list1);
        double list2Percent = getPercentOverlap(common,list2);

        System.out.println("Percent of list 1: "+list1Percent);
        System.out.println("Percent of list 2: " +list2Percent);

    }
        //this method reads in all the data from an external file
        //applies case folding. arrayList is the sorted to
        //eliminate duplicates. the method returns and Arraylist
        public static ArrayList<String> getWords(Scanner input){
        // read all words and sort
        ArrayList<String> words = new ArrayList<String>();
        while(input.hasNext()){
            words.add(input.next().toLowerCase());
        }
        Collections.sort(words);

        //eliminate duplicates in the array list
        ArrayList<String> uniqueWords = new ArrayList<>();
        if(words.size() > 0){
            uniqueWords.add(words.get(0));
            for (int i = 1;i<words.size();i++){
                if(!words.get(i).equals(words.get(i-1))){
                    uniqueWords.add(words.get(i));
                }
            }
        }


        return uniqueWords;
    }


    public static ArrayList<String> getOverlap(ArrayList<String> list1,ArrayList<String> list2){
        ArrayList<String> overlap = new ArrayList<>();
        int x = 0;
        int y = 0;
        while(x<list1.size() && y<list2.size()){
            if(list1.get(x).equals(list2.get(y))){
                overlap.add(list1.get(x));
                x++;
                y++;
            } else if(list1.get(x).compareTo(list2.get(y)) <0){
                x++;
            } else {
                y++;
            }
        }





        return overlap;
    }
    public static double getPercentOverlap(ArrayList<String> common,ArrayList<String> list){
        return ((double)common.size()/list.size()*100.0);
    }


    public static ArrayList<String> stopWordDeleter(ArrayList<String> finnsihed) throws FileNotFoundException{
        Scanner input3 = new Scanner(new File("stop.txt"));
        for(int i = 0;i<finnsihed.size();i++)
            while(input3.hasNext()){
                if(input3.next().equals(finnsihed.get(i))){
                    finnsihed.remove(finnsihed.get(i));
                }
            }
            return finnsihed;
    }

}
