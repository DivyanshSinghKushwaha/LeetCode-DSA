class Solution {
    public double minPrice(int[] prices, int[] discounts) {
        Arrays.sort(prices);
        Arrays.sort(discounts);
        double total=0;
        int p=prices.length-1;
        int d=discounts.length-1;
        while(p>=0 && d>=0){
            total+=(prices[p]*(100-discounts[d]))/100.0;
            p--;d--;
        }
        while(p>=0){
            total+=prices[p];
            p--;
        }
        return total;
    }
}