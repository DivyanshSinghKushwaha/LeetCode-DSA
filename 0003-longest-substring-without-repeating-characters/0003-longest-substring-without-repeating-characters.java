class Solution {
    public int lengthOfLongestSubstring(String s) {
        char freq[]=new char[128];
        int i,j,longest;
        i=j=longest=0;
        for(i=0,j=0;j<s.length();j++){
            freq[s.charAt(j)]++;
            while(freq[s.charAt(j)]>1){
                freq[s.charAt(i)]--;
                i++;
            }
            longest=Math.max(longest,j-i+1);
        }
        return longest;
    }
}