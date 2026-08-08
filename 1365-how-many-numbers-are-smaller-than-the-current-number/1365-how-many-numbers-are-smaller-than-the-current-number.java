class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int arr[] =new int[nums.length];
        int count[] = new int[101];
        for(int i=0;i<101;i++){
            for(int x : nums){
                if(x<i) count[i]++;
            }
        }
        int i=0;
        for(int x: nums){
            arr[i]=count[x];
            i++;
        }
        return arr;
    }
}