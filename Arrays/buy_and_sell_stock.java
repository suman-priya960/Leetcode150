public class buy_and_sell_stock {
    public int maxProfit(int[] prices) {
        int n=prices.length;
        int mn=Integer.MAX_VALUE;
        int maxprofit=0;
        for(int i=0;i<n;i++){
            if(prices[i]<mn)mn=prices[i];
            else{
                int profit=prices[i]-mn;
                if(profit>maxprofit)maxprofit=profit;
            }
        }
        return maxprofit;
    }
}
