package Ch7Arrays;

import java.util.Arrays;

public class JasonRothmanTest2 {
    public static void main(String[] args) {
        //Author: Jason Rothman
        //Date: 11/14/18
        //Period: 2


    }

    /////////////////// Q3 \\\\\\\\\\\\\\\\\\\\\\\\\
    public static void swapPairs(String[] a) {
        String[] temp = a;
        for (int i = 0; i < a.length / 2; i += 2) {
            a[i] = temp[i + 1];
        }
    }

    /////////////////// Q4 \\\\\\\\\\\\\\\\\\\\\\\\\
    public static int[] collapse(int[] a) {
        int[] b = new int[a.length / 2 + 1];
        int x = 0;
        for (int i = 0; i < a.length; i += 2) {
            b[x] = a[i] + a[i + 1];
            x++;
        }
        if (a.length % 2 != 0) {
            b[b.length] = a[a.length];
        }
        return b;
    }

    /////////////////// Q6 \\\\\\\\\\\\\\\\\\\\\\\\\
    public static int[] vowelCount(String a) {
        int[] count = new int[5];
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) == 'a') {
                count[0]++;
            } else if (a.charAt(i) == 'e') {
                count[1]++;
            } else if (a.charAt(i) == 'i') {
                count[2]++;
            } else if (a.charAt(i) == 'o') {
                count[3]++;
            } else if (a.charAt(i) == 'u') {
                count[4]++;
            }
        }
        return count;
    }

    /////////////////// Q7 \\\\\\\\\\\\\\\\\\\\\\\\\
    public static int[] flattenedArray(int[][] a) {
        int[] line = new int[a[a.length][] * a[][a.length]]
        int x = 0;
        for (int rows = 0; rows < a[a.length][];rows++){
            for (int col = 0; col < a[][a.length];col++){
                line[x] = a[rows][col];
                x++;
            }
        }
        return line;
    }
}
