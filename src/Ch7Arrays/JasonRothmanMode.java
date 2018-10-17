package Ch7Arrays;

import java.util.Scanner;

public class JasonRothmanMode {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("What number do you want to find the mode of:");
        int number = sc.nextInt();
        System.out.println("The mode is " + mode(number));

    }public static int mode(int num) {
        int[] array = new int[10];
        while (num > 0) {
            int test = num % 10;
            array[test]++;
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

    }public static int mode2(int num) {
        int count0 = 0;
        int count1 = 0;
        int count2 = 0;
        int count3 = 0;
        int count4 = 0;
        int count5 = 0;
        int count6 = 0;
        int count7 = 0;
        int count8 = 0;
        int count9 = 0;
        while (num > 0) {
            int digit = num % 10;
            if (digit == 0) {
                count0++;
            } else if (digit == 1) {
                count1++;
            } else if (digit == 2) {
                count2++;
            } else if (digit == 3) {
                count3++;
            } else if (digit == 4) {
                count4++;
            } else if (digit == 5) {
                count5++;
            } else if (digit == 6) {
                count6++;
            } else if (digit == 7) {
                count7++;
            } else if (digit == 8) {
                count8++;
            } else if (digit == 9) {
                count9++;
            }
            num /= 10;
        }
        num /= 10;
        int max = Math.max(count0, Math.max(count1, Math.max(count2, Math.max(count3, Math.max(count4, Math.max(count5, Math.max(count6, Math.max(count7, Math.max(count8, count9)))))))));
        if (max == count0) {
            return 0;
        } else if (max == count1) {
            return 1;
        } else if (max == count2) {
            return 2;
        } else if (max == count3) {
            return 3;
        } else if (max == count4) {
            return 4;
        } else if (max == count5) {
            return 5;
        } else if (max == count6) {
            return 6;
        } else if (max == count7) {
            return 7;
        } else if (max == count8) {
            return 8;
        } else if (max == count9) {
            return 9;
        }
        return max-max;
    }
}

