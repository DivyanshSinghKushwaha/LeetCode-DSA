class Solution {
    public int missingInteger(int[] nums) {
        Set<Integer> elements = new HashSet<>();
        for(int x : nums){
            elements.add(x);
        }
        int sum=nums[0];
        int i;
        i=1;
        while(i<nums.length && nums[i-1]+1==nums[i]){
            sum+=nums[i];
            i++;
        }

        while(elements.contains(sum)) sum++;
        return sum;
    }
}