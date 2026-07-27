class Solution { //122. Best Time to Buy and Sell Stock II
    public int maxProfit(int[] prices) {
        int n=prices.length;
        int minprice=Integer.MAX_VALUE,maxprofit=0;
        
        for(int i=0;i<n;i++){
            if(prices[i]<minprice){
                minprice=prices[i];
            }else {
         int s=prices[i]-minprice;
        maxprofit+=s;
                minprice=prices[i];
            }
        }
        return maxprofit;
        
    }
}
