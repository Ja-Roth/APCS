package Ch7Arrays;

import java.util.Arrays;

public class ArrayTraversal {
    public static void main(String[] args){
        int[] array = {11, 42, -5, 27, 0, 89};
        AbbyAlgo(array);
        JohnnyAlgo(array);

    } public static void JohnnyAlgo(int[] ja){
        for(int i = 0;i<=ja.length-1;i++){
            int x = ja[i];
            ja[i] = ja[ja.length-1 - i];
            ja[ja.length -1 - i] = x;
        }
        System.out.println(Arrays.toString(ja));

    }public static void AbbyAlgo(int[] aa){
        //step 1: create a new temp int array of same size
        int[] temp = new int[aa.length];
       // int j = 0;
        //step 2; copy the contents in new array
        for(int i=aa.length-1;i>=0;i--){
            //temp[j] = aa[i];
            //j++;
            temp[aa.length -i-1] = aa[i];

        }
        aa=temp;
        System.out.println(Arrays.toString(aa));
    }
}
