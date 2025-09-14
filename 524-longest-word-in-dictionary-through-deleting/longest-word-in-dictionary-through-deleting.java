class Solution {
    public String findLongestWord(String s, List<String> dictionary) {
        String result = "";
        
        for (int i = 0; i < dictionary.size(); i++) {
            String word = dictionary.get(i);
            int j = 0;
            
            for (int k = 0; k < s.length() && j < word.length(); k++) {
                if (s.charAt(k) == word.charAt(j)) {
                    j++;
                }
            }
            
            if (j == word.length()) {
                if (word.length() > result.length() ||
                   (word.length() == result.length() && word.compareTo(result) < 0)) {
                    result = word;
                }
            }
        }
        
        return result;
    }
}