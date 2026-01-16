class Solution{
    public int rob(int[] nums){
        int prevMaxProfit = 0;
        int prevPrevMaxProfit = 0;

        for(int n : nums){
            int currMaxProfit = Math.max(prevMaxProfit, prevPrevMaxProfit + n);
            prevPrevMaxProfit = prevMaxProfit;
            prevMaxProfit = currMaxProfit;
        }

        return prevMaxProfit;
    }
}
