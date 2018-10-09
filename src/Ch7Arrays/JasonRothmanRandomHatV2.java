
package Ch7Arrays;


import java.util.Random;
import java.util.Scanner;


public class JasonRothmanRandomHatV2 {
    public static void main(String[] args) {
        //create an empty array
        int[] array = {};
        //user input
        System.out.println("How many teams: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        //system for checking if the number is odd or even than calls the method if it is even
        if (n % 2 != 0) {
            System.out.println("Must be even number of teams");
        } else {
            array = RandomizeArray(n);
            divide(array);
        }
    }

    public static int[] RandomizeArray( int b) {
        Random rgen = new Random();  // Random number generator
        int size = b ;
        int[] array = new int[size];
        //for loop to populate the array
        for (int i = 0; i < size; i++) {
            array[i] = 1 + i;
        }
        // for loop to randomize the array
        for (int i = 0; i < array.length; i++) {
            int randomPosition = rgen.nextInt(array.length);
            int temp = array[i];
            array[i] = array[randomPosition];
            array[randomPosition] = temp;
        }


        return array;

    }
    // method to put the teams in an team vs team
    public static void divide(int[] array) {
        for (int i = 0; i <= array.length - 1; i += 2) {
            System.out.println("Team " + array[i] + " Vs " + "Team " + array[i + 1]);
        }
    }
}
