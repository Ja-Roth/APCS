package Ch7Arrays;

public class JasonRothmanMode {
    public static void main(String[] args){
        System.out.println("The mode is " + mode(66002123));

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

    }
}
