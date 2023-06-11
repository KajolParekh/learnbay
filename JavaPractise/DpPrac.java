public class DpPrac {
    public static void main(String[] args) {
        //climbStairs(5);
        //System.out.println(climbStairs(4));
        //int [] ar1 = new int [10];
        System.out.println(climbStairsDP(3));
    }
    //Q1: There are n stairs, a person standing at the bottom wants to reach the top. The person can climb either 1 stair or 2 stairs at a time. Count the number of ways, the person can reach the top.
    public static int climbStairs(int n) {
        if(n<=1) return n;
        return climbStairs(n-1) + climbStairs(n-2);
    }

    public static int climbStairsDP(int n) {
        if(n == 1) return 1; //only one possible path
        if(n == 0) return 0; //no possiblePath
        int count = 0;
        for(int jumps=1; jumps <= n ; jumps++) {
            count += climbStairsDP(n-jumps);
        }
        return count;
    }
}
