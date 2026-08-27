class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int sum=0,count=0;
        for(int x: nums){
            sum+=x;
            if(map.containsKey(sum-k)){
                count+=map.get(sum-k);
            }
            if(sum==k) count++;
            map.put(sum,map.getOrDefault(sum,0)+1);
        }
        return count;
    }
}