class Solution {
    public int[] divisibilityArray(String word, int m) {
        int n = word.length();
        int[] div = new int[n];
        long num = 0;
        for (int i = 0; i < n; i++) {
            num = (num * 10 + (word.charAt(i) - '0')) % m;
            if (num == 0) {
                div[i] = 1;
            } else {
                div[i] = 0;
            }
        }
        return div;
    }
}