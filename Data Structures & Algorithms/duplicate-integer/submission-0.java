class Solution {
    public boolean hasDuplicate(int[] nums) {
        boolean hasDuplicate = false;

        for (int i = 0; i < nums.length; i++) {
            int curNum = nums[i];
            for (int j = i + 1; j < nums.length; j++) {
                if (curNum == nums[j]) {
                    hasDuplicate = true;
                }
            }
        }

        return hasDuplicate;
    }
}