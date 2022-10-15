package Day1;

public class sortarray0and1_approach2 {
    public static void main(String[] args) {
        int[] nums={0,1,1,0,1,2,1,2,0,0,0,1};
        dutchalgo(nums);
        for(int a:nums)
            System.out.print(a);
    }
    public static void dutchalgo(int nums[])
    {
        int low=0;
        int mid=0;
        int high= nums.length-1;
        int temp;
        while(mid<=high)
        {
            switch (nums[mid])
            {
                case 0:
                    temp=nums[low];
                    nums[low]=nums[mid];
                    nums[mid]=temp;
                    mid++; low++;
                    break;
                case 1:
                    mid++;
                    break;
                case 2:
                    temp=nums[high];
                    nums[high]=nums[mid];
                    nums[mid]=temp;
                    high--;
                    break;
            }
        }
    }
}
