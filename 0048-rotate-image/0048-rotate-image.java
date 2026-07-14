class Solution {
    public void rotate(int[][] matrix) {
        
//transpose
  for(int i=1;i<matrix.length;i++){
    for(int j=0;j<i;j++){
        int temp=matrix[i][j];
        matrix[i][j]=matrix[j][i];
        matrix[j][i]=temp;
    }
  }
//rows interchange
  for(int i=0;i<matrix.length;i++){
    int stcol=0;
    int endcol=matrix[0].length-1;

    while(stcol<endcol){
        int temp2=matrix[i][stcol];
        matrix[i][stcol]=matrix[i][endcol];
        matrix[i][endcol]=temp2;
        stcol++;
        endcol--;
    }
  }


    }
}