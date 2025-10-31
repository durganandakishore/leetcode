class Solution {
    public int maxFrequencyElements(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        if (n == 1) {
            return 1;
        }
        int maxFreq = 1;
        int currFreq = 1;
        int total = 0;
        for (int i = 1; i < n; i++) {
            if (nums[i] == nums[i - 1]) currFreq++;
            else currFreq = 1;
            maxFreq = Math.max(maxFreq, currFreq);
        }
        currFreq = 1;
        for (int i = 1; i <= n; i++) {
            if (i < n && nums[i] == nums[i - 1]) {
                currFreq++;
            } else {
                if (currFreq == maxFreq) total += currFreq;
                currFreq = 1;
            }
        }

        return total;
    }
}