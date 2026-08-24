class Solution {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder temp=new  StringBuilder();
        int i,j, min;
        char ch;
        min=strs[0].length();
        for (i=0;i<strs.length;i++){
            if(strs[i].length()<min)
                min=strs[i].length();
        }
        for(i=0;i<min;i++){
            ch=strs[0].charAt(i);
            for(j=0;j<strs.length;j++){
                if(ch!=strs[j].charAt(i))
                    return temp.toString();
            }
            temp.append(ch);
        }
        return temp.toString();
}}