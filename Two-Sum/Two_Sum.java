import java.util.*;
class Solution {
    public int[] twoSum(int[] nums, int target) 
    {
        int i=0,j=0;
        int b[]=new int[2];
        for(i=0;i<nums.length;i++)
        {
            for(j=0;j<nums.length;j++)
            {
                if(((nums[i]+nums[j])==target) && (i!=j))
                {
                    b[0]=i;
                    b[1]=j;
                    break;
                }
            }
        }
        return b;
    }
}