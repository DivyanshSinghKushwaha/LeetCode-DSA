class Solution {
    public void moveZeroes(int[] nums) {
        int i,j;
        int count=0;
        for(i=0,j=0;j<nums.length;j++){
            if(nums[j]==0){
                count++;
                continue;
            }
            nums[i]=nums[j];
            i++;
        }
        for(j=0;j<count;j++){
            nums[i+j]=0;
        }
    }
}