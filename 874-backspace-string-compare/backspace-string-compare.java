class Solution {
    public boolean backspaceCompare(String s, String t) {
        char[] arr1 = new char[s.length()];
        int idx1 = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '#') {
                if (idx1 > 0) idx1--; 
            } else {
                arr1[idx1] = s.charAt(i);
                idx1++;
            }
        }
        char[] arr2 = new char[t.length()];
        int idx2 = 0;
        for (int j = 0; j < t.length(); j++) {
            if (t.charAt(j) == '#') {
                if (idx2 > 0) idx2--;
            } else {
                arr2[idx2] = t.charAt(j);
                idx2++;
            }
        }
        String finalS = new String(arr1, 0, idx1);
        String finalT = new String(arr2, 0, idx2);
        return finalS.equals(finalT);
    }
}