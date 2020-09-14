package easy;

public class Nth_Tribonacci_Number {

    static int[] index = new int[38];

    public int tribonacci(int n) {
        index[0] = 0;
        index[1] = 1;
        index[2] = 1;

        return recursive(n);
    }

    public int recursive(int n) {
        if(n < 0) {
            return 0;
        }
        if(index[n] != 0) {
            return index[n];
        }
        index[n] = recursive(n-3) + recursive(n-2) + recursive(n-1);
        return index[n];
    }

    public static void main(String[] args) {
        Nth_Tribonacci_Number solution = new Nth_Tribonacci_Number();
        System.out.println(solution.tribonacci(25));
        System.out.println("");

    }
}
