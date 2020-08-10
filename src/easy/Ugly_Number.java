package easy;

public class Ugly_Number {
    public boolean isUgly(int num) {

        // 2, 3, 5
        if(num < 1) {
            return false;
        }

        while (num > 1 && num % 2 == 0) {
            num = num / 2;
        }

        while (num > 1 && num % 3 == 0) {
            num = num / 3;
        }

        while (num > 1 && num % 5 == 0) {
            num = num / 5;
        }

        return num == 1;
    }

    public static void main(String[] args) {
        Ugly_Number solution = new Ugly_Number();

        System.out.println(solution.isUgly(6));
    }
}
