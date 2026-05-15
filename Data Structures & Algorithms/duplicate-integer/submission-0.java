class Solution {
    public static boolean containsDuplicate(int[] nums){
        Set<Integer> seen=new HashSet<>();
        for(int i=0; i<nums.length; i++){
            if(!seen.add(nums[i])){
                return true;
            }
        }
        return false;
    }
    public boolean hasDuplicate(int[] nums) {
        boolean result= containsDuplicate(nums);
        return result;
    }
}