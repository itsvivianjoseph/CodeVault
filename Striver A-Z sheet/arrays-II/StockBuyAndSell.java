public class StockBuyAndSell {
    static int bestTime(int[] prices){
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = Integer.MIN_VALUE;
        for(int i=0;i<prices.length;i++){
            if(minPrice > prices[i]) minPrice = prices[i];
            maxProfit = Math.max(maxProfit, prices[i] - minPrice);
        }
        return maxProfit;
    }
    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};
        System.out.println("the best time is : "+bestTime(prices));
    }
}