class Solution {
    public boolean checkDivisibility(int n) {
        int sum,prd;
        int num=n;
        sum=0;
        prd=1;
        while(n!=0){
            sum+=n%10;
            prd*=n%10;
            n/=10;
        }
        return num%(sum+prd)==0;
    }
}