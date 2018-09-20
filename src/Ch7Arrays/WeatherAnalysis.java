package Ch7Arrays;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class WeatherAnalysis {
    public static void main(String[] args){
        //This program calculates the average temperature for N days
        // Identifies how many days are above the average
        userInput();

    }
    public static void userInput(){
        int x=0;
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
        double avg = (double)sum/n;
        System.out.println("Average temp = " + round(avg));
        aboveAverage(avg, numbers, n);



    }
    public static double round(double value) {

        BigDecimal bd = new BigDecimal(Double.toString(value));
        bd = bd.setScale(1, RoundingMode.HALF_UP);
        return bd.doubleValue();
    }
    public static void aboveAverage(double avg, int[] array, int n) {
        int larger = 0;
        for (int i = 1; i <= n; i++) {
            if (array[i - 1] > avg) {
                larger++;
            }
        }
        if (larger > 1){
            System.out.println(larger + " days were above average.");
    }
        else{
            System.out.println(larger + " day were above average.");
        }

    }
}

