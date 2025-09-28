package DAY_2.HomeAssignment_2;

public class Valid_Perfect_Square {
    public static void main(String[] args) {
        int n=16;
        System.out.println(isPerfectSquare(n));
        
    }
    public static boolean isPerfectSquare(int num) {
        if (num < 2) return true; 

        long lo = 1, hi = num / 2; 
        while (lo <= hi) {
            long mid = lo + (hi - lo) / 2;
            long square = mid * mid;

            if (square == num) return true;
            if (square < num) {
                lo = mid + 1;
            } else {
                hi = mid - 1;
            }
        }
        return false;
        
    }
    
}
