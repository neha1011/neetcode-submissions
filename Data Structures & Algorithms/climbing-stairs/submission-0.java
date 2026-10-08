class Solution {
    public int climbStairs(int n) {
         int[] climbWays = new int[n+1];
        climbWays[0] = 0;
        if(n>=1)
        climbWays[1] = 1;
        if(n>=2)
        climbWays[2]=2;
        
       for(int i=3;i<=n;i++)
       climbWays[i] = climbWays[i-1] + climbWays[i-2];
       return climbWays[n];
    }
}
