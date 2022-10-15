public class NextPermutation_day1
{
    public static void nextPermutation(int[] nums)
    {
        if (nums==null || nums.length<=1)
            return;
        int i=nums.length-2;
        while (i>=0 && nums[i]>=nums[i+1])
            i--;
        if(i>=0)
        {
            int j=nums.length-1;
            while(nums[j]<=nums[i] )
                j--;
            swap(nums,i,j);
        }
        reverse(nums,i+1,nums.length-1);
    }
    public static void reverse(int[] nums,int a,int b)
    {
        while(a<b)
            swap(nums,a++,b--);
    }
    public static void swap(int[] nums,int a,int b)
    {
        int t=nums[a];
        nums[a]=nums[b];
        nums[b]=t;
    }
    public static void main(String args[])
    {
        int nums[]={1,1};
        nextPermutation(nums);
        for (int i=0;i<nums.length;i++)
            System.out.print(nums[i]);
    }
}
