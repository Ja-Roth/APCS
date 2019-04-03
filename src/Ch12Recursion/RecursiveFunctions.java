package Ch12Recursion;

public class RecursiveFunctions {
    public static void main (String[] args){
        System.out.println(a(12));
        System.out.println(b(10,2));
        System.out.println(c(16));
        System.out.println(d(10,3));



    }
    public static int a(int x){
        //base case
        if(x<=4){
            return x+4;
        }
        //recursive case
        else if(x>6){
            return 2*a(x-3)-3;
        } else{
            return a(x+2) + 1;
        }
    }
    public static int b(int x,int y){
        if(x>y){
            return b(x-2,y+2)+2;
        } else if(x==y){
            return b(x+1,y-1)-1;
        } else{
            return x*y;
        }
    }
    public static int c(int x){
        if(x>10){
            return c(c(x-2))+3;
        } else if(x==10){
            return (x+1)-1;
        } else{
            return x-4;
        }
    }
    public static int d(int x,int y){
        if (x>5){
            return d(x-2,y+1)+x;
        } else if(x<0){
            return x*x +x;
        } else{
            return d(x-3,y+2) +y;
        }
    }
}
