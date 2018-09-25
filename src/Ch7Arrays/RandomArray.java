package Ch7Arrays;


import java.lang.reflect.Array;
import java.util.Arrays;

public class RandomArray {

    public static void main(String[] args){
        int [] random = new int[(int) (Math.random() * 10)];
        for(int i = 0; i < Array.getLength(random); i++) {
            random[i] = (int) (Math.random() * 10 + 1);
        }
        System.out.println(Arrays.toString(random));
    }
}
