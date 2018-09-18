package Ch7Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class WeatherAnalysis {
    public static void main(String[] args){
        //This program calculates the average temperature for N days
        // Identifies how many days are above the average
        //Step 1 : Ask how many days
        System.out.print("How many days' temperatures? ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        //Step 2 : initialize the array
        int[] numbers = new int[n];
        // Step 3 : add the numbers
        int sum=0;

        for (int i = 1; i<=n; i++){
            System.out.print("Day "+i+"'s high temp:");
            int x =sc.nextInt();
            numbers[i-1] = x;
            sum +=x;

        }
        System.out.println("Average temp = " + (double)sum/n);


    }
}
