package easy;

import java.util.ArrayList;
import java.util.List;

public class Island_Perimeter {

    public int islandPerimeter(int[][] grid) {

        if(grid.length == 0 || grid == null || grid[0].length == 0)
            return 0;

        int perimeter = 0;
        //Loop over the matrix to check land
        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid[i].length; j++){
                //If we find land add 4 in perimeter
                if(grid[i][j] == 1){
                    perimeter += 4;
                    //check if left is also 1, reduce the perimeter by 2
                    if(i > 0 && grid[i - 1][j] == 1)
                        perimeter -= 2;
                    //check if right is also 1, reduce the perimeter by 2 again
                    if(j > 0 && grid[i][j - 1] == 1)
                        perimeter -= 2;
                }
            }
        }
        //return the perimeter
        return perimeter;
    }

    public static void main(String[] args) {
        Island_Perimeter solution = new Island_Perimeter();
        int[][] grid = {{0, 0, 0, 0, 0},{0, 1, 1, 1, 0},{0, 1, 0, 1, 0},{0, 1, 1, 1, 0},{0, 0, 0, 0, 0}};
        System.out.println(solution.islandPerimeter(grid));
    }
}
