class Solution {
    public int pivotInteger(int n) {
        int i=1, sum=0,flag=0;
        while(i<=n){
            sum+=i;
            if(sum==(n*(n+1)/2-sum+i)){ 
                flag=1;
                break;
            }
            i++;
        }
        if(flag==1) return i;
        else return -1;
    }
}