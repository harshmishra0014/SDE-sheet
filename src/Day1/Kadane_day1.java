
public class Kadane_day1
{
    public static void main(String[] args)
    {
        int[] nums={-2,-3,4,-1,-2,1,5,-3};
        System.out.println(maxsubArray(nums));
    }
    public static int maxsubArray(int nums[])
    {
        int sum=0;
        int maxsum=nums[0];
        for(int a: nums)
        {
            sum+=a;
            if(sum>maxsum)
                maxsum=sum;
            if(sum<0)
                sum=0;
        }
        return maxsum;
    }

}
