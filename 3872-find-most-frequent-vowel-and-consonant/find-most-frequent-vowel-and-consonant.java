class Solution {
    public int maxFreqSum(String s) {
        int[] freq = new int[26];
        for (char c : s.toCharArray()) {
            freq[c - 'a']++;
        }
        int maxVowel = 0;
        int maxConsonant = 0;
        for (int i = 0; i < 26; i++) {
            if (freq[i] > 0) {
                char c = (char) (i + 'a');
                if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                    maxVowel = Math.max(maxVowel, freq[i]);
                } else {
                    maxConsonant = Math.max(maxConsonant, freq[i]);
                }
            }
        }
        return maxVowel + maxConsonant;
    }
}