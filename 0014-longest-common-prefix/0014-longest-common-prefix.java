class Solution {
    public String longestCommonPrefix(String[] strs) {
    Arrays.sort(strs); 
        String s1=""; 
        int i=0; 
        
        while(i<strs[0].length() && i<strs[strs.length-1].length()) { 
            if(strs[0].charAt(i)==strs[strs.length-1].charAt(i)) {
                s1=s1+strs[0].charAt(i);
            } else {
                break;
            }
            i++; 
        } 
        return s1; 

    }
    
}