package easy;

public class Fibonacci_Number {

    Integer[] arr = new Integer[31];

    public int fib(int N) {

        if(N == 1) {
            return 1;
        }
        if(N == 2) {
            return 1;
        }
        arr[1] = 1;
        arr[0] = 0;
        return memo(N);
    }

    private int memo(final int n) {
        if(arr[n] != null) {
            return arr[n];
        }
        arr[n] = memo(n-1) + memo(n-2);
        return arr[n];
    }

    public static void main(String[] args) {
        Fibonacci_Number solution = new Fibonacci_Number();
        System.out.println(solution.fib(4));
    }
}
