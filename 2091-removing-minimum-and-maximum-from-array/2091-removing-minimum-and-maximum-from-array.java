class Solution {
    public int minimumDeletions(int[] nums) {
        int i,min,max;
        min=max=0;
        for(i=0;i<nums.length;i++){
            if(nums[i]<=nums[min]) min=i;
            if(nums[i]>=nums[max]) max=i;
        }

        return Math.min(Math.min(Math.max(min,max)+1,nums.length-Math.min(min,max)),Math.min(max,min)+1+nums.length-Math.max(max,min));
    }
}