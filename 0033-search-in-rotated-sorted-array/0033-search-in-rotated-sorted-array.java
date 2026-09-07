class Solution {
    public int search(int[] nums, int target) {
        int beg,end,mid;
        beg=0;
        end=nums.length-1;
        mid=0;
        int k=0;
        while(beg<end){
            mid=(end+beg)/2;
            if(nums[mid]>nums[end]){
                beg=mid+1;
            }
            else if(nums[mid]<nums[end]){
                end=mid;
            }
        }
        k=end;
        beg=0;
        end=k-1;
        while(beg<=end){
            mid=(end+beg)/2;
            if(nums[mid]<target) beg=mid+1;
            else if(nums[mid]>target) end=mid-1;
            else return mid;
        }
        beg=k;
        end=nums.length-1;
        while(beg<=end){
            mid=(end+beg)/2;
            if(nums[mid]<target) beg=mid+1;
            else if(nums[mid]>target) end=mid-1;
            else return mid;
        }
        return -1;
    }
}