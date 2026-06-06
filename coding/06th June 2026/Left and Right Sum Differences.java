class Solution 
{
    public int[] leftRightDifference(int[] nums) 
    {
		int n=nums.length;
		int[] leftSum=new int[n];
		int[] rightSum=new int[n];
		int[] answer=new int[n];
		leftSum[0]=0;
		rightSum[n-1]=0;
		for(int i=0;i<n-1;i++)
			leftSum[i+1]=leftSum[i]+nums[i];
		for(int j=n-1;j>0;j--)
			rightSum[j-1]=rightSum[j]+nums[j];
		for(int i=0;i<n;i++)
		{
			answer[i]=leftSum[i]-rightSum[i];
			if (answer[i]<0)
				answer[i]=-answer[i];
		}
        return answer;  
    }
}
