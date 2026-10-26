class Solution {
    public boolean isValid(String s) {
        if(s.length()%2!=0)
		return false;
	Stack<Character> st=new Stack<>();
	for(char x:s.toCharArray()) {
		if(x=='('||x=='['||x=='{')
			st.push(x);
		else if(st.isEmpty()) {
		return false;
		}
		else {
			char temp=st.pop();
			if((x==')'&& temp!='(')||(x==']' && temp!='[')||(x=='}' && temp!='{'))
				return false;
		}
	}
	return(st.isEmpty());

    }
}