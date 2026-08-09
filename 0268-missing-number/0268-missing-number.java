class Solution {
    public int missingNumber(int[] nums) {
        int counter[] = new int[nums.length+1];
        for(int x : nums){
            counter[x]++;
        }
        for(int i=0; i<counter.length;i++){
            if(counter[i]==0){
                return i;
            }
        }
        return 0;
    }
}