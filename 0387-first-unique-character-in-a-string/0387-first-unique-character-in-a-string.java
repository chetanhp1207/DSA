class Solution {
    public int firstUniqChar(String s) {
         LinkedHashMap<Character, Integer> hm = new LinkedHashMap<>();

    for (int i = 0; i < s.length(); i++) {
        char ch = s.charAt(i);

        hm.put(ch, hm.getOrDefault(ch, 0) + 1);
    }

    for (Map.Entry<Character, Integer> entry : hm.entrySet()) {

        if (entry.getValue() == 1) {
            return s.indexOf(entry.getKey());
        }
    }
    return -1;
    }
}