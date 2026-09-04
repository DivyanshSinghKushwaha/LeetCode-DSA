class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int score;
        int i,max,min;
        int suffixMin[] = new int[nums.length];
        max=nums[0];
        min=nums[nums.length-1];
        for(i=nums.length-1;i>=0;i--){
            min=Math.min(min,nums[i]);
            suffixMin[i]=min;
        }
        for(i=0;i<nums.length;i++){
            max=Math.max(max,nums[i]);
            if(max-suffixMin[i]<=k){ 
                return i;
            }
        }
        return -1;
         
    }
}