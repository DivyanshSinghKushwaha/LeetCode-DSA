class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int total=0;
        for(int x :cardPoints){
            total+=x;
        }
        int n=cardPoints.length;
        int i,j;
        i=0;j=0;
        int sum=0;
        int ans=0;
        while(i<n&&j<n){        
            while(j-i<n-k)
                sum+=cardPoints[j++];
            ans=Math.max(ans,total-sum);
            sum-=cardPoints[i++];
        }
        return ans;
    }
}