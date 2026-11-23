import java.util.Stack;

class Solution {
    public int calPoints(String[] operations) {

        Stack<Integer> st = new Stack<>();

        for (String x : operations) {

            if (x.equals("C")) {
                st.pop();
            }
            else if (x.equals("D")) {
                st.push(st.peek() * 2);
            }
            else if (x.equals("+")) {
                int last = st.peek();
                int secondLast = st.get(st.size() - 2);
                st.push(last + secondLast);
            }
            else {
                st.push(Integer.parseInt(x));
            }
        }
        int sum = 0;
        for(int i: st){
            sum+=i;
        }
        return sum;
    }
}