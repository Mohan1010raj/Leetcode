class Solution {
    public int countValidSelections(int[] nums) {
        int n = nums.length;
        int validSelections = 0;

        for (int i = 0; i < n; i++) {
            if (nums[i] == 0) {
                if (isValid(nums, i, -1)) validSelections++;
                if (isValid(nums, i, 1)) validSelections++;
            }
        }

        return validSelections;
    }
    static boolean isValid(int[] nums, int start, int direction) {
        int n=nums.length;
        int[] copy = Arrays.copyOf(nums, nums.length);
        int curr = start;

        while (curr >= 0 && curr < n) {
            if (copy[curr] == 0) {
                curr += direction;
            } else {
                copy[curr]--;
                direction = -direction;
                curr += direction;
            }
        }
        for (int num : copy) {
            if (num != 0) return false;
        }
        return true;
    }
}