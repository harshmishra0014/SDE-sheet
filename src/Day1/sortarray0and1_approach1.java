package Day1;

public class sortarray0and1_approach1
{
    //this approach is using counting sort technique
    public static void main(String[] args)
    {
        int [] nums={2,0,2,1,1,0};
        sortColors(nums);
        for(int a: nums)
            System.out.print(a+" ");
    }
    public static void sortColors(int[] nums)
    {
        int[] freq={0,0,0};
        for(int a:nums)
            freq[a]++;
        for(int i=0;i<nums.length;i++)
        {
            if(freq[0]-->0)
                nums[i]=0;
            else if(freq[1]-->0)
                nums[i]=1;
            else
                nums[i]=2;
        }
    }
}

