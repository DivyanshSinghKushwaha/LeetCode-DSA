class Solution {
    public long maxAlternatingSum(int[] nums) {
        long sum=0;
        int i;
        for(i=0;i<nums.length;i++){
            nums[i]=nums[i]*nums[i];
        }
        Arrays.sort(nums);
        i=0;
        while(i<nums.length/2){
            sum-=nums[i];
            i++;
        }
        while(i<nums.length){
            sum+=nums[i];
            i++;
        }
        return sum;
    }
}