class Solution {
    public int kItemsWithMaximumSum(int numOnes, int numZeros, int numNegOnes, int k) {
        int sum = 0;
        int take = Math.min(numOnes, k);
        sum += take;
        k -= take;
        take = Math.min(numZeros, k);
        k -= take;
        if (k > 0) {
            sum -= k;
        }
        return sum;
    }
}