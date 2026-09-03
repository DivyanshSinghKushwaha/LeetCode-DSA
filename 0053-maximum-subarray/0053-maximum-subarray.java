class Solution {
    public int maxSubArray(int[] nums) {
        int max=Integer.MIN_VALUE;
        int j;
        int sum=0;
        for(j=0;j<nums.length;j++){
            sum+=nums[j];
            max=Math.max(sum,max);
            if(sum<=0){
                sum=0; 
            }
        }
        return max;
    }
}