class Solution {
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int left=0,right=nums.length-1,sum=0;
        for(int i=0;i<nums.length;i+=2){
            sum+=nums[i];
        }
        return sum;    
    }
}