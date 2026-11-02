

class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> m1 = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int no = target - nums[i];

            if (m1.containsKey(no)) {
                return new int[]{m1.get(no), i};
            }

            m1.put(nums[i], i);
        }

        return new int[]{};
    }
}