class Solution {
    public int minimumLength(String s) {
        int[] freq = new int[26];
        for (char ch : s.toCharArray()) freq[ch - 'a']++;
        int ans = 0;
        for (int f : freq) {
            if (f == 0) continue;
            if (f % 2 == 1) ans += 1;
            else ans += 2;
        }
        return ans;
    }
}