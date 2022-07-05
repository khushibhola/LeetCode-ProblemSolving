class Solution {
    public boolean isValid(String s) {
        int i=0;
		Stack<Character> obj=new Stack<Character>();

		for(i=0;i<s.length();i++)
		{
			if(s.charAt(i)=='(' || s.charAt(i)=='{' || s.charAt(i)=='[')
			{
				obj.push(s.charAt(i));
			}
			else
			{
				if(obj.isEmpty())
				{
					return false;
				}
				char currentCharacter=obj.peek();
				if((currentCharacter=='(' && s.charAt(i)==')') ||(currentCharacter=='[' && s.charAt(i)==']') ||(currentCharacter=='{' && s.charAt(i)=='}')  )
				{
					obj.pop();	
				}
				else 
				{
					return false;
				}
			}

		}
		if(obj.isEmpty())
		{
			return true;
		}
		else
		{
			return false;
		}
  }
}
