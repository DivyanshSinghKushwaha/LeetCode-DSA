class Solution {
    public void sortColors(int[] nums) {
        int arr[] =new int[3];
        for(int x: nums) arr[x]++;
        int ind,i;
        ind=i=0;
        while(i<nums.length){
            while(arr[ind]==0){
                ind++;
            }
            nums[i]=ind;
            arr[ind]--;i++;
        }
    }
}