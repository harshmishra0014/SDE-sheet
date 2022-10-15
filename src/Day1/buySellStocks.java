package Day1;

public class buySellStocks {
    public static void main(String[] args) {

       int[] nums={7,1,5,3,6,4};
        //int[] nums={7,6,4,3,1};
        int profit=maxProfit(nums);
        System.out.println(profit);
    }
    public static int maxProfit(int[] nums)
    {
        int min=Integer.MAX_VALUE;
        int profit=0;
        for(int a: nums)
        {
            if(a<min)
                min=a;
            if(a-min > profit)
                profit=a-min;
        }
        return profit;
    }
}
