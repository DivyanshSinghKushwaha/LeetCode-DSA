class Solution {
    public void rotate(int[] nums, int k) {
        int i,j,temp,len;
        len=nums.length;
        i=0;
        j=nums.length-1;
        while(i<j){
            temp=nums[i];
            nums[i]=nums[j];
            nums[j]=temp;
            i++;j--;
        }
        for(i=0,j=(k%len)-1 ; i<j ; i++,j--){
            temp=nums[i];
            nums[i]=nums[j];
            nums[j]=temp;
        }
        for(i=(k%len),j=len-1 ; i<j ; i++,j--){
            temp=nums[i];
            nums[i]=nums[j];
            nums[j]=temp;
        }
    }
}