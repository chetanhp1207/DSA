class Solution {
    public boolean checkPerfectNumber(int num) {
        if(num==1)
        return false;
        int sum=0,temp=num,count=0;
        for(int i=1;i<=num/2;i++){
            if(num%i==0){
                sum+=i;
                count++;
            }
        }
        if(temp%sum==0 && count>1)
        return true;
        return false;
    }
}