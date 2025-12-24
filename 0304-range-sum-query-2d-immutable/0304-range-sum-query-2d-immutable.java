class NumMatrix {
int[][] prefix;
    public NumMatrix(int[][] matrix) {
        int r=matrix.length;
        int c= matrix[0].length;
        prefix = new int[r][c];
        int sum=0;
        for(int i=0; i<r;i++) {
            sum=0;
            for(int j=0;j<c;j++) {
                prefix[i][j] = matrix[i][j] + sum;
                sum += matrix[i][j];
            }
        }
    }
    
    public int sumRegion(int row1, int col1, int row2, int col2) {
        int s=0;
        int k=row1;
        while(k<=row2) {
            if(col1==0) {
                s += prefix[k][col2];    }
            else {
            s += prefix[k][col2] - prefix[k][col1-1];   }
            k++;
        }
        return s;
    }
}

/**
 * Your NumMatrix object will be instantiated and called as such:
 * NumMatrix obj = new NumMatrix(matrix);
 * int param_1 = obj.sumRegion(row1,col1,row2,col2);
 */