class Solution {
    public String largestEven(String s) {
        StringBuilder sb = new StringBuilder(s);
        while (sb.length() > 0) {
            if (sb.charAt(sb.length() - 1) == '2') {
                return sb.toString();
            }
            sb.deleteCharAt(sb.length() - 1);
        }
        return "";
    }
}