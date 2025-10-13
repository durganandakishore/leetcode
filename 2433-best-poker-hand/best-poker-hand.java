class Solution {
    public String bestHand(int[] ranks, char[] suits) {
       int rc = 1;  
        int sc = 1;  
        Arrays.sort(ranks);
        Arrays.sort(suits);

        for (int i = 0; i < suits.length - 1; i++) {
            if (suits[i] == suits[i + 1]) {
                sc++;
            }
        }

        if (sc == 5) {  
            return "Flush";
        }
        int count = 1;
        int maxCount = 1;
        for (int i = 0; i < ranks.length - 1; i++) {
            if (ranks[i] == ranks[i + 1]) {
                count++;
                maxCount = Math.max(maxCount, count);
            } else {
                count = 1;
            }
        }
        if (maxCount >= 3) {
            return "Three of a Kind";
        } else if (maxCount == 2) {
            return "Pair";
        } else {
            return "High Card";
        }
    }
}