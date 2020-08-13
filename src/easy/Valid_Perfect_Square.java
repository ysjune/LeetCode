package easy;

public class Valid_Perfect_Square {

    public boolean isPerfectSquare(int num) {

        //return Math.sqrt(num) - (int)(Math.sqrt(num)) == 0;

        if(num == 0 || num == 1) return true;
        long low = 1,high = num/2;
        while(low<=high){
            long mid = (low+high)/2;
            if(mid*mid == num)
                return true;
            else if(mid*mid < num)
                low = mid+1;
            else if(mid*mid > num)
                high = mid-1;
        }
        return false;

    }

    public static void main(String[] args) {
        Valid_Perfect_Square solution = new Valid_Perfect_Square();
        System.out.println(solution.isPerfectSquare(15));
    }
}
