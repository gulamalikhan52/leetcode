class Solution {
    public int[][] transpose(int[][] matrix) {
        int row=matrix.length;
        int column=matrix[0].length;

        int [][] brr=new int[column][row];
        for(int i=0;i<brr.length;i++){
            for(int j=0;j<brr[0].length;j++){
                brr[i][j]=matrix[j][i];
            }
        }
        return brr;



    }
}