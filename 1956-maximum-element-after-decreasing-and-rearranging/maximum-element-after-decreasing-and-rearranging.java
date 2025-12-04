class Solution {
    public int maximumElementAfterDecrementingAndRearranging(int[] arr) {
         Arrays.sort(arr);
        int expected = 1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= expected) {
                expected++;
            }
        }
        return expected - 1;
    }
}