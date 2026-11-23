
class Solution {
    public int calPoints(String[] operations) {

        Stack<Integer> st = new Stack<>();
        int sum=0;
        for (String x : operations) {

            if (x.equals("C")) {
                sum-=st.pop();
            }
            else if (x.equals("D")) {
                int val=st.peek() * 2;
                st.push(val);
                sum+=val;
            }
            else if (x.equals("+")) {
                int last = st.peek();
                int secondLast = st.get(st.size() - 2);
                int val1=last + secondLast;
                st.push(val1);
                sum+=val1;
            }
            else {
                int val2=Integer.parseInt(x);
                st.push(val2);
                sum+=val2;
            }
        }
        return sum;
    }
}