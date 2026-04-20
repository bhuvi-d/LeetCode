class Solution {
    public void rotate(int[][] matrix) {
        for(int j =0; j<matrix[0].length;j++) {
            for (int i = j+1; i < matrix[0].length; i++) {
        // finding transpose
                int row = matrix[j][i];
                matrix[j][i] = matrix[i][j];
                matrix[i][j] = row;
    }
}

        for (int k = 0; k < matrix[0].length; k++) {
            int left = 0;
            int right = matrix[k].length - 1;

        while (left < right) {
            int temp = matrix[k][left];
            matrix[k][left] = matrix[k][right];
            matrix[k][right] = temp;
            left++;
            right--;
    }
}
    }
}
