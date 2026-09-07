class Solution {
    public int[] rearrangeArray(int[] nums) {
        int arr[]=new int[nums.length];
        int i;
        int p,n;
        p=0;n=1;
        int len=nums.length;
        for(i=0;i<nums.length;i++){
            if(nums[i]>0){
                arr[p]=nums[i];
                p+=2;
            }
            else if(nums[i]<0){
                arr[n]=nums[i];
                n+=2;
            }
        }
        return arr;
    }
}