class Solution {
    public boolean isPalindrome(int x) {
        int res=0,rem=0,y=x;
        if(x<0)
        return false;
        while(x!=0){
            rem=x%10;
            res=(res*10)+rem;
            x/=10;
        }
        if(y==res)
        return true;
        return false;

    }
}