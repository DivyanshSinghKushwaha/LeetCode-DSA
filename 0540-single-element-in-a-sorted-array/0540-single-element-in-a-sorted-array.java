class Solution {
    public int singleNonDuplicate(int[] nums) {
        int beg, mid, end;
        beg=mid=0;
        end=nums.length-1;
        while(beg<=end){
            mid=(beg+end)/2;
            if(mid==0||mid==nums.length-1) break;
            if(nums[mid]==nums[mid-1]) {
                if((end-mid)%2==0)
                    end=mid-2;
                else beg=mid+1;
            }
            else if(nums[mid]==nums[mid+1]) {
                if((end-mid)%2==0)
                    beg=mid+2;
                else end=mid-1;
            }
            else break;
        }
        return nums[mid];
    }
}