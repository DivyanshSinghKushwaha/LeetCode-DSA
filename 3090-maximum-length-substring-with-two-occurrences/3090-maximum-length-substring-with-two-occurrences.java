//Using HashArray as practice
class Solution {
    public int maximumLengthSubstring(String s) {
        char freq[]= new char[26];
        int i, j, longest=0;
        for(i=0,j=0;j<s.length();j++){
            freq[s.charAt(j)-'a']++;
            while(freq[s.charAt(j)-'a']>2){
                freq[s.charAt(i)-'a']--;
                i++;
            }
            longest=Math.max(j-i+1,longest);
        }
        return longest;
    }
}