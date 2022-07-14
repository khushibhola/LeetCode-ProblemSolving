class Solution {
    public boolean isSameAfterReversals(int num) {
      
        int num2=0,rev=0,numR=0,rev2=0;
        num2=num;
        while(num2!=0)
        {
            rev=rev*10+(num2%10);
            num2=num2/10;
        }
        numR=rev;
        while(numR!=0)
        {
            rev2=rev2*10+(numR%10);
            numR=numR/10;
        }
        if(rev2==num)
        {
            return true;
        }
        else
        {
            return false;
        }
     }
}