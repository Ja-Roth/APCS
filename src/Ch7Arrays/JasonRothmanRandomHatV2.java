
package Ch7Arrays;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;


public class JasonRothmanRandomHatV2 {
    public static void main(String[] args) {
        int[] array = {};
        System.out.println("How many teams");

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n%2!=0){
            System.out.println("Must be even number of teams");
        }else{
           array = RandomizeArray(1,n);
        }
        System.out.println(Arrays.toString(array));



        }
    public static int[] RandomizeArray(int a, int b){
        Random rgen = new Random();  // Random number generator
        int size = b-a+1;
        int[] array = new int[size];

        for(int i=0; i< size; i++){
            array[i] = a+i;
        }

        for (int i=0; i<array.length; i++) {
            int randomPosition = rgen.nextInt(array.length);
            int temp = array[i];
            array[i] = array[randomPosition];
            array[randomPosition] = temp;
        }


        return array;

    }
   // public static void divide ()
    }
