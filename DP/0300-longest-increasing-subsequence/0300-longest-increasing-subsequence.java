class Solution{
    public int lengthOfLIS(int[] nums){
        int[] LIS = new int[nums.length];
        for(int i = 0; i < nums.length; i++){
            LIS[i] = 1;
        }

        for(int i = nums.length - 1; i > -1; i--){
            for(int j = i + 1; j < nums.length; j++){
                if(nums[i] < nums[j]){
                    LIS[i] = Math.max(LIS[i], 1 + LIS[j]);
                }
            }
        }

        int maxLIS = 1;
        for(int val : LIS){
            maxLIS = Math.max(maxLIS, val);
        }

        return maxLIS;
    }
}