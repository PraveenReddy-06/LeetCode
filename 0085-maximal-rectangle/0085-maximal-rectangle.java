class Solution {
    public int maximalRectangle(char[][] matrix) {
        int m=matrix.length;
        int n=matrix[0].length;
        int[][] arr = new int[m][n];

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(i>0){
                    arr[i][j] = matrix[i][j]-'0' + arr[i-1][j];
                }
                else{
                    arr[i][j] = (matrix[i][j])-'0';
                }
                if(matrix[i][j]-'0'==0){
                    arr[i][j]=0;
                }
            }
        }
        Stack<Integer> stack = new Stack<>();
        int max=0;
        for(int i=0;i<m;i++){
            stack.clear();
            for(int j=0;j<=n;j++){
                int cur = (j == n) ? 0 : arr[i][j];
                while(!stack.isEmpty() && arr[i][stack.peek()]>= cur){
                    int height= arr[i][stack.pop()]; 
                    int width = stack.isEmpty() ? j : (j - stack.peek() - 1);

                    max=Math.max(max,height*width);
                }
                stack.push(j);
            }
        }
        return max;
    }
}