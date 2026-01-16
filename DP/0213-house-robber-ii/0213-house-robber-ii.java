class Solution{
    public int rob(int[] nums){
        return Math.max(nums[0], 
            Math.max(helper(Arrays.copyOfRange(nums, 1, nums.length)), 
            helper(Arrays.copyOfRange(nums, 0, nums.length-1))));
    }

    private int helper(int[] nums){
        int prevMaxProfit = 0;
        int prevPrevMaxProfit = 0;

        for(int n : nums){
            int currMaxProfit = Math.max(prevMaxProfit, n + prevPrevMaxProfit);
            prevPrevMaxProfit = prevMaxProfit;
            prevMaxProfit = currMaxProfit;
        }

        return prevMaxProfit;
    }
}