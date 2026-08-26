class Solution {
    public boolean check(int[] nums) {
        int i,flag;
        flag=0;
        if(nums.length==1) return true;
        for(i=1;i<nums.length;i++){
            if(nums[i]<nums[i-1]) flag++;
        }
        if(flag==0) return true;
        else if( flag==1 && nums[0]>=nums[nums.length-1]) return true;
        else return false;
    }
}
