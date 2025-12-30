class Solution {
    public int[][] matrixBlockSum(int[][] mat, int k) {
        int r=mat.length;
        int c=mat[0].length;
        int[][] prefix = new int[r+1][c+1];
        int top,left,topleft;
        for(int i=1;i<=r;i++) {
            for(int j=1;j<=c;j++){
                top=prefix[i-1][j];
                left=prefix[i][j-1];
                topleft=prefix[i-1][j-1];
                prefix[i][j] = mat[i-1][j-1]+top+left-topleft;
            }
        }
        int[][] answer = new int[r][c];

        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                int r1 = Math.max(0, i - k);
                int c1 = Math.max(0, j - k);
                int r2 = Math.min(r - 1, i + k);
                int c2 = Math.min(c - 1, j + k);

                answer[i][j] =
                        prefix[r2 + 1][c2 + 1]
                      - prefix[r1][c2 + 1]
                      - prefix[r2 + 1][c1]
                      + prefix[r1][c1];
            }
        }
        return answer;
    }
}