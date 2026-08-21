class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack= new Stack<>();
        char ch,top;
        for(int i=0;i<s.length();i++){
            ch=s.charAt(i);
            if(stack.isEmpty()){
                stack.push(ch);
                continue;
            }
            top=stack.peek();
            if((top=='(' && ch==')') ||(top=='{'&&ch=='}')|| (top=='['&&ch==']')) stack.pop();
            else stack.push(ch);
        }
        
        return stack.isEmpty();
    }
}