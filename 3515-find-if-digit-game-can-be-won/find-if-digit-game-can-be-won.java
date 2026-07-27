class Solution {
    public boolean canAliceWin(int[] nums) {
        int singleDigitsum = 0;
        int doubleDigitSum = 0;
        
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < 10) {
                singleDigitsum += nums[i];
            } else {
                doubleDigitSum += nums[i];
            }

        }

        if (singleDigitsum > doubleDigitSum) return true;
        if (singleDigitsum < doubleDigitSum) return true;
        return false;
    }
}