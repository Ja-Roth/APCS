package Ch7Arrays;

import java.util.Arrays;

public class Arrays2D {
    public static void main(String[] args){
        int [][] table = new int[5][10];
        for (int row = 0; row < table.length; row++) {
            for (int column = 0; column < table[row].length; column++) {
                table[row][column] = (row)*(column);
            }

        }
        System.out.println();
    }
}
