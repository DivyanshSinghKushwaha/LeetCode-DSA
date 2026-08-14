//Using HashMap as practice
class Solution {
    public int maximumLengthSubstring(String s) {
        HashMap<Character,Integer> freq= new HashMap<>();
        int i, j, longest=0;
        for(i=0,j=0;j<s.length();j++){
            freq.put(s.charAt(j),freq.getOrDefault(s.charAt(j),0)+1);
            while(freq.get(s.charAt(j))>2){
                freq.put(s.charAt(i),freq.get(s.charAt(i))-1);
                i++;
            }
            longest=Math.max(j-i+1,longest);
        }
        return longest;
    }
}