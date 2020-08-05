package week_challenge;

public class Power_of_Four {
    public boolean isPowerOfFour(int num) {
        if (num <= 0) {
            return false;
        }
        while (num > 1) {
            if (num % 4 != 0) {
                return false;
            }
            num /= 4;
        }

        return num == 1;
    }

    public static void main(String[] args) {
        Power_of_Four solution = new Power_of_Four();
        System.out.println(solution.isPowerOfFour(16));
    }
}
