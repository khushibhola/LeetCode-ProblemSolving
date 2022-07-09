import java.util.*;
class Solution {
    public int mostWordsFound(String[] sentences)
    {
         int i=0,c=0,flag=0,max=0;
	        int b[]=new int[sentences.length];
	        for(i=0;i<sentences.length;i++)
	        {
	            StringTokenizer obj=new StringTokenizer(sentences[i]," ");
	            c=obj.countTokens();
	            b[i]=c;
	        }
	        for(i=0;i<b.length;i++)
	        {
	            if(flag==0)
	            {
	                max=b[i];
	                flag++;
	            }
	            if(b[i]>max)
	            {
	                max=b[i];
	            }
	        }
	        return max;
    }
}