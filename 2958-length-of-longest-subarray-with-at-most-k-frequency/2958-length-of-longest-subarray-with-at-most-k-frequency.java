class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        HashMap<Integer,Integer> freq = new HashMap<>();
        int i,j,longest;
        i=j=0;
        longest=1;
        while(i<nums.length && j<nums.length){
            freq.put(nums[j],freq.getOrDefault(nums[j],0)+1);
            while(freq.get(nums[j])>k){
                freq.put(nums[i],freq.get(nums[i])-1);
                i++;
            }
            longest=Math.max(longest,j-i+1);
            j++;
        }
        return longest;
    }
}