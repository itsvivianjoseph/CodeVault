class StockBuyAndSell
{
    static int maxProfit(int[] arr)
    {
        int max_profit=0,min_price=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++)
        {
            min_price = Math.min(min_price,arr[i]);
            max_profit = Math.max(max_profit,arr[i]-min_price);
        }
        return max_profit;
    }

    public static void main(String[] args) {
        int[] arr = {7,1,5,3,6,4};
        System.out.println(maxProfit(arr));
    }
}