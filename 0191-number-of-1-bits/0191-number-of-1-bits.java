class Solution {
    public int hammingWeight(int n) {
        int a=0,r=0;
        while(n!=0){
           r=n%2;
           if(r!=0)
           a++;
           n/=2; 
        }
        return a;
    }
}