class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {

        int currentCount = 0;
        int maximumCount = 0;

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] == 1) {

                currentCount++;

                if (currentCount > maximumCount) {
                    maximumCount = currentCount;
                }

            } else {

                currentCount = 0;

            }
        }

        return maximumCount;
    }
}