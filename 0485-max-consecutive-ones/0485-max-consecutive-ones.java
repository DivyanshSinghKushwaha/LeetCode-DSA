class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max=0,temp=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                temp++;
                continue;
            }
            else if(max<temp){
                max=temp;
            }
            temp=0;
        }
        if(temp>max) return temp;
        else return max;
    }
}