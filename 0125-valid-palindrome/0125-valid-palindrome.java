class Solution {
    public boolean isPalindrome(String s) {
        s=s.toLowerCase();
         s=s.replaceAll("[^a-z0-9]","");
         
        char ch[]=s.toCharArray();
        int i=0,j=ch.length-1;
        while(i<j){
            if(ch[i]!=ch[j]){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}