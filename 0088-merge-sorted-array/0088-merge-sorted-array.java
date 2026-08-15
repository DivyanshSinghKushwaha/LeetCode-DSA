class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i,j,k;
        i=j=k=0;
        int arr[] =new int[m+n];
        while(i<m && j<n){
            if(nums1[i]<nums2[j]) arr[k++]=nums1[i++];
            else arr[k++]=nums2[j++];
        }
        while(i<m) arr[k++]=nums1[i++];
        while(j<n) arr[k++]=nums2[j++];
        i=0;
        while(i<m+n) nums1[i]=arr[i++];
    }
}