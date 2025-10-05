class Solution {
    public int reverseDegree(String s) {
         int total = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            int reversedValue = 'z' - c + 1;
            int position = i + 1; 
            total += reversedValue * position;
        }
        return total;
    }
}