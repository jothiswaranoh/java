import java.util.*;

public class Fibonacci {
    public static long fib(int n, Map<Integer, Long> memo) {
        if (memo.containsKey(n)) 
        {
            return memo.get(n);
        }
        if (n <= 2) {
            
            return 1;
        }
        long fib = fib(n - 1, memo) + fib(n - 2, memo);
        memo.put(n, fib);
        return fib;
    }

public static long fibb(int n) {

        if (n <= 2) {
            
            return 1;
        }

        return fibb(n-1)+fibb(n-2);
    }
    
    public static void main(String[] args) {
        Map<Integer, Long> memo = new HashMap<>();
        int n = 50;
        long fib = fib(n, memo);
        System.out.println(fib);
        // long fib=fibb(n);
        //  System.out.println(fib);
    }
}
