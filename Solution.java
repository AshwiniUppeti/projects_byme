class Solution {
    public int[] twoSum(int[] nums, int target) {
        int c[]=new int[2];
        int i,j,n=nums.length;
        for(i=0;i<n;i++)
        {
            for(j=i+1;j<n;j++)
            {
                if(nums[i]+nums[j]==target)
                {
                    c[0]=i;
                    c[1]=j;  
                    break;             }

            }

        }
        return c;
        
    }
}
