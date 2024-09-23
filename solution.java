import java.util.*;
class solution {

    public static long fn(List<Integer> nums, int idx, int pre, long dp[][]) {
        // base case
        if(idx < 0) return 0;
        if(idx==0) {
            return (pre-idx) * nums.get(idx);
        }

        // not take 
        if(dp[idx][pre] != -1) return dp[idx][pre];
        long notTake = 0 + fn(nums, idx-1, pre, dp);

        //take
        long take = (pre-idx)*nums.get(idx) + fn(nums, idx-1, idx, dp);
        return dp[idx][pre] = Math.max(notTake, take);
        
    }


    public static long findMaximumScore(List<Integer> nums) {
        int n = nums.size();
        long dp[][] = new long[n][n];
        for(int i=0; i<n; i++) {
            Arrays.fill(dp[i], -1);
        }


        return fn(nums, n-1, n-1, dp);
    }


public static void main(String[] args) {
    List<Integer> list = new ArrayList<>();
    list.add(4);
    list.add(3);
    list.add(1);
    list.add(3);
    list.add(2);
    long ans = findMaximumScore(list);
    System.out.println(ans);
    
}
             
}