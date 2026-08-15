class Solution {
    public int majorityElement(int[] nums) {
        int count,n;
        count=n=0;
        for(int i:nums){
            if(count==0) {n=i;count++;}
            else if(n==i) count++;
            else count--;
        }
        return n;
    }
}