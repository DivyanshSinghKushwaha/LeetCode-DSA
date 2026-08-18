class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder str = new StringBuilder(s.toLowerCase());
        char ch;
        for(int i=str.length()-1;i>=0;i--){
            ch=str.charAt(i);
            if((ch >'z' || ch <'a')&& !(ch>='0' && ch<='9'))
                str.deleteCharAt(i);
        }
        for(int i=0;i<str.length()/2;i++){
            ch=str.charAt(i);
            if(ch!=str.charAt(str.length()-1-i)) return false;
        }
        return true;
    }
}