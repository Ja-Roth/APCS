package Ch12Recursion;

public class Pow {
    public static void main(String[] args){

    } public static int iterative(int down,int up){
        int counter=0;
        for (int i = up;i>0;i--){
            counter *=counter;
        }
        return counter;
    }
}
