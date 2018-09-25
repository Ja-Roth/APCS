package Ch7Arrays;


import java.util.Arrays;
import java.util.Scanner;

import static java.util.Arrays.sort;

public class JasonRothmanWeatherAnalysis2 {
    public static void main(String[] args){
        //This program calculates the average temperature for N days
        // Identifies how many days are above the average
        //Call the method to do it
        userInput();

    }
    public static void userInput(){

        //Step 1 : Ask how many days
        System.out.print("How many days' temperatures? ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        //Step 2 : initialize the array
        int[] numbers = new int[n];
        // Step 3 : add the numbers
        int sum=0;
        //Forloop for adding numbers to the array
        for (int i = 1; i<=n; i++){
            System.out.print("Day "+i+"'s high temp:");
            int x =sc.nextInt();
            numbers[i-1] = x;
            sum +=x;


        }
        //calculates the average than rounds it and prints it.
        double avg = (double)sum/n;
        avg = (Math.round(avg * 10.0)) / 10.0;
        System.out.println("Average temp = " + avg);
        aboveAverage(avg, numbers, n);
        System.out.println();
        System.out.println("Temperatures: " + Arrays.toString(numbers));
        smallandlarge(numbers, n);





    }
    //Method to find which are above average
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
        // It bothered me that it would say 1 days, so i put this.
        else{
            System.out.println("1 day was above average.");
        }


    }
    public static void smallandlarge(int[] elements, int n) {
        //sorts all of the ints from small to large
        sort(elements);
        //print the first number which is index 0 than prints the second which is index 1
        System.out.println("Two coldest days: " + elements[0] +", "+ elements[1]);
        //prints the largest number first than the second largest.
        System.out.println("Two hottest days: " + elements[n-1] +", "+ elements[n-2]);


}

}


