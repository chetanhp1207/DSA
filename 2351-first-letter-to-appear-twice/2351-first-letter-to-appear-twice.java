class Solution {
    public char repeatedCharacter(String s) {
         LinkedHashMap<Character, Integer> hm = new LinkedHashMap<>();

	        for (int i = 0; i < s.length(); i++) {
	            char ch = s.charAt(i);

	            if (hm.containsKey(ch)) {
	                return ch;
	            }

	            hm.put(ch, 1);
	        }

	        return ' ';
    }
}