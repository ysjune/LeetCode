package week_challenge;

public class Target_Number {

    public int solution(int[] numbers, int target) {
        return DFS(numbers, target, 0, 0);
    }

    public int DFS(int[] numbers, int target, int index, int sum) {
        if (index == numbers.length) {
            return sum == target ? 1 : 0;
        } else {
            return DFS(numbers, target, index + 1, sum + numbers[index])
                    + DFS(numbers, target, index + 1, sum - numbers[index]);
        }
    }

    public static void main(String[] args) {
        Target_Number sol = new Target_Number();
        int[] s = {1, 1, 1, 1, 1};
        System.out.println(sol.solution(s, 3));
    }
}
