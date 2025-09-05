// User function Template for Java

class Solution {
    int findMaxAverage(int[] nums, int n, int k) {
        // code here
        int ans=Integer.MIN_VALUE;
        int start=0,count=0;
        int sum=0,avg=0;
        for(int end=0;end<nums.length;end++)
        {
            sum+=nums[end];
            count++;
            if(count==k)
            {
                avg=sum/k;
                ans=Math.max(ans,avg);
                sum-=nums[start++];
                count--;
            }
        }
        return ans;
        
    }
}
