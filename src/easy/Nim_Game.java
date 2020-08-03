package easy;

public class Nim_Game {

    public boolean canWinNim(int n) {
        return (n % 4 != 0);
    }

    public static void main(String[] args) {
        Nim_Game solution = new Nim_Game();
        System.out.println(solution.canWinNim(4));
    }
}
