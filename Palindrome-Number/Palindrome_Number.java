class Solution {
    public boolean isPalindrome(int x) 
    {
        int n2=0,rev=0;
        n2=x;
        while(n2!=0)
        {
            rev=rev*10+(n2%10);
            n2=n2/10;
        }
        if(rev==x)
        {
            if(x<0)
            {
                return false;
            }
            else
            {
                return true;
            }
        }
        else
        {
            return false;
        }
    }
}