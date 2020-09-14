package week_challenge;

public class Rotting_Oranges {

    public int orangesRotting(int[][] grid) {

        int count = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if(grid[i][j] == 2) {

                    if(i > 0 && grid[i-1][j] == 1) {
                      grid[i-1][j] = 2;
                      count++;
                    }
                    if(j > 0 && grid[i][j-1] == 1) {
                        grid[i][j-1] = 2;
                        count++;
                    }
                }
            }
        }
        return count;

    }

    public static void main(String[] args) {
        Rotting_Oranges solution = new Rotting_Oranges();
        int[][] grid = {{2,1,1},{1,1,0},{0,1,1}};
        System.out.println(solution.orangesRotting(grid));
    }
}
