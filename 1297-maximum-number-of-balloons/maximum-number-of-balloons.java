class Solution {
    public int maxNumberOfBalloons(String text) {
        int[] freq = new int[26];
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            freq[c - 'a']++;
        }
        int countB = freq['b' - 'a'] / 1;
        int countA = freq['a' - 'a'] / 1;
        int countL = freq['l' - 'a'] / 2;
        int countO = freq['o' - 'a'] / 2;
        int countN = freq['n' - 'a'] / 1;
        return Math.min(
            Math.min(Math.min(Math.min(countB, countA), countL), countO),
            countN);
    }
}