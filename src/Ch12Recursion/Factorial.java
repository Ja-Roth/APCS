package Ch12Recursion;

public class Factorial {
    public static void main(String[] args) {
        System.out.println(iterativeFactorial(4));
        System.out.println(recursiveFactorial(4));



    }

    public static int iterativeFactorial(int x) {
        int newX=1;
        for (int i = x; i > 0; i--) {
            newX *= i;
        }
        return newX;

    }
    public static int recursiveFactorial(int x){
        if (x==0){
            return 1;
        }
        else {
            return recursiveFactorial(x-1)*x;
        }

    }
}

