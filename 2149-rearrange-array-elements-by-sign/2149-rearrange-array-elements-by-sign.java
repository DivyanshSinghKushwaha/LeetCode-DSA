class Solution {
    public int[] rearrangeArray(int[] nums) {
        int arr[]=new int[nums.length];
        int i,j,k;
        i=j=k=0;
        int len=nums.length;
        while(i<len && j<len){
            while(i<len && nums[i]<0) i++;
            while(j<len && nums[j]>0) j++;
            arr[k++]=nums[i++];
            arr[k++]=nums[j++];
        }
        return arr;
    }
}