class Solution {
    public int findPeakElement(int[] nums) {
        int beg,mid,end;
        beg=mid=0;
        end=nums.length-1;
        if(nums.length==1) return mid;
        while(beg<end){
            mid=(end+beg)/2;
            if(nums[mid]<nums[mid+1]) 
                beg=mid+1;
            else 
                end=mid;
        }
        return beg;
    }
}