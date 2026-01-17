class Solution {
    public int jump(int[] nums){
       int numOfJumps = 0;
       int l = 0;
       int r = 0;
       
       while(r < nums.length - 1){
        int farthest = 0;
        for(int i = l; i < r + 1; i++){
            if(farthest < nums[i] + i){
                farthest = nums[i] + i;
            }
        }
        l = r + 1;
        r = farthest;
        numOfJumps++;
       }

       return numOfJumps;
    }
}
