class Solution {
    public int missingMultiple(int[] nums, int k) {
        Set<Integer> set =new HashSet<>();
        for(int x: nums){
            set.add(x);
        }
        int temp=k;
        while(set.contains(k)){
            k+=temp;
        }
        return k;
    }
}