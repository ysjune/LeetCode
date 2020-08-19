package week_challenge;

public class Distribute_Candies_to_People {

    public int[] distributeCandies(int candies, int num_people) {
        int[] ret = new int[num_people];

        int index = 0;
        int num = 1;
        while (candies > 0) {
            if(candies < num) {
                ret[index] += candies;
                break;
            }
            ret[index] += num;
            candies -= num;
            num++;
            index++;

            if(index == num_people) {
                index = 0;
            }
        }
        return ret;
    }


    public static void main(String[] args) {
        Distribute_Candies_to_People solution = new Distribute_Candies_to_People();
        System.out.println(solution.distributeCandies(7, 4));
    }
}
