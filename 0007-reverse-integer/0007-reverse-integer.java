class Solution {
    public int reverse(int x) {
        long res=0,r=0;
        while(x!=0){
            r=x%10;
            res=(res*10)+r;
            x/=10;
        }
        if(res>=Integer.MIN_VALUE&&res<=Integer.MAX_VALUE)
        return (int)res;
        return 0;
    }
}