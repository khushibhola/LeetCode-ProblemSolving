class Solution {
    public String longestCommonPrefix(String[] strs) {
    	int i=0,j=0;
		String tempCheck="",commonMatchingText=strs[i];
		if(strs.length==1)
		{
		 return strs[0];	
		}
		if(strs.length!=0 && strs != null)
		{
		for(i=0;i<strs.length-1;i++)
		{
			int shortestLength;
			if(commonMatchingText.length()<=strs[i+1].length())
			{
				shortestLength=commonMatchingText.length();
			}
			else
			{
				shortestLength=strs[i+1].length();
			}
			for(j=1;j<=shortestLength;j++)
			{

				if(commonMatchingText.substring(0,j).equals(strs[i+1].substring(0,j)))   
				{
					tempCheck=commonMatchingText.substring(0,j);

				}
				else
				{
					break;
				}
			}
			if(tempCheck=="")
			{
				return tempCheck;
			}
			commonMatchingText=tempCheck;
			tempCheck="";
		}
		}
		return commonMatchingText;

	}
}