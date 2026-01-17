class Solution{
    public boolean canJump(int[] nums){
        int destination = nums.length - 1;

        for(int i = destination - 1; i > -1; i--){
            if(nums[i] + i >= destination){
                destination = i;
            }
        }

        return destination == 0;
    }
}