class Solution {
    public boolean hasDuplicate(int[] nums) {
        boolean result = false;
        for (int outer = 0; outer < nums.length - 1; outer++) {
            for (int inner = (outer + 1); inner < nums.length; inner++) {
                if (nums[outer] == nums[inner]) {
                    result = true;
                    break;
                }
            }
            if (result) {
                break;
            }
        }
        return result;
    }
}