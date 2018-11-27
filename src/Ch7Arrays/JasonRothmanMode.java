package Ch7Arrays;

import java.util.Scanner;

public class JasonRothmanMode {
    public static void main(String[] args){
        //creates a scanner
        Scanner sc = new Scanner(System.in);
        //asks for the number
        System.out.print("What number do you want to find the mode of:");
        //takes the user input
        int number = sc.nextInt();
        System.out.println("The mode is " + mode(number));

    } //method to find the modes
    public static int mode(int num) {
        int[] array = new int[10];
        //keeps going till the number is zero
        while (num > 0) {
            int test = num % 10;
            array[test]++;
            //takes away the last digit
            num /= 10;
        }
        int max = array[0];
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
                index = i;
            }
        }
        return index;

    }
}

