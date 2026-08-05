package leetCodeRecursion;

public class leetCode509 {
    public static int fib(int n) {


        if(n<=1){
            return n;
        }else{
            n = fib(n-1)+fib(n-2);
        }

        return n;

    }

    public static void main(String[] args) {
        System.out.println(leetCode509.fib(4));
    }
}
