package easy;

public class Count_Primes {
    public int countPrimes(int n) {

        int count = 0;
        for (int i = 2; i < n; i++) {
            if (isPrime(i)) {
                count++;
            }
        }
        return count;
    }

    boolean isPrime(int n) {
        int c = (int) Math.sqrt(n);
        for (int i = 2; i <= c; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
//        if (n <= 2) {
//            return 0;
//        }
//
//        boolean[] primes = new boolean[n];
//        Arrays.fill(primes, true);
//        int count = n - 2;
//
//        for (int i = 2; (i * i) <= n; i++) {
//            if (!primes[i]) {
//                continue;
//            }
//            for (int j = i; i * j < n; j++) {
//                if (primes[i * j]) {
//                    primes[i * j] = false;
//                    count--;
//                }
//            }
//        }
//        return count;
//    }

    /**
     *
     * Count the number of prime numbers less than a non-negative number, n.
     *
     * Example:
     * Input: 10
     * Output: 4
     *
     * Explanation: There are 4 prime numbers less than 10, they are 2, 3, 5, 7.
     *
     */
    public static void main(String[] args) {
        Count_Primes solution = new Count_Primes();
        System.out.println(solution.countPrimes(10));
    }
}
