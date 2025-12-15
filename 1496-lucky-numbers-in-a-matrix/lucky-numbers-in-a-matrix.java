class Solution {
    public List<Integer> luckyNumbers(int[][] matrix) {
        List<Integer> result = new ArrayList<>();
        int m = matrix.length;
        int n = matrix[0].length;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                int num = matrix[i][j];
                boolean isMinRow = true;
                boolean isMaxCol = true;
                for (int col = 0; col < n; col++) {
                    if (matrix[i][col] < num) {
                        isMinRow = false;
                        break;
                    }
                }
                for (int row = 0; row < m; row++) {
                    if (matrix[row][j] > num) {
                        isMaxCol = false;
                        break;
                    }
                }
                if (isMinRow && isMaxCol) {
                    result.add(num);
                }
            }
        }
        return result;
    }
}