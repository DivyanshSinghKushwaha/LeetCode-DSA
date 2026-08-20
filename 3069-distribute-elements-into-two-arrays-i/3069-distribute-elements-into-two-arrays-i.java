class Solution {
    public int[] resultArray(int[] nums) {
        List<Integer> arr1 = new ArrayList<>();
        List<Integer> arr2 = new ArrayList<>();
        arr1.add(nums[0]);
        arr2.add(nums[1]);
        int i;
        for(i=2; i<nums.length;i++){
            if(arr1.get(arr1.size()-1)>arr2.get(arr2.size()-1)) arr1.add(nums[i]);
            else arr2.add(nums[i]);
        }
        int ans[] = new int[nums.length];
        i=0;
        for(int x : arr1) ans[i++]=x;
        for(int x : arr2) ans[i++]=x;
        return ans;
    }
}