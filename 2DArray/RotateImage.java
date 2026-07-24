class Solution {
    public void rotate(int[][] matrix) { int n=matrix.length-1;       int r=matrix.length,c=matrix[0].length;
                                        int temp[][]=new int[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
     temp[j][n-i]=matrix[i][j];
            }
        }
for(int i=0;i<r;i++){
    for(int j=0;j<c;j++){
        matrix[i][j]=temp[i][j];
    }
}
   }
}
//2nd
class Solution {
    public void rotate(int[][] matrix) {
        int r=matrix.length,c=matrix[0].length;
        for(int i=0;i<r;i++){
            for(int j=i;j<c;j++){
                int temp=matrix[i][j];
    matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }
    
        for(int i=0;i<r;i++){
            int st=0,ed=r-1;
            while(st<=ed){
    int temp=matrix[i][st];
matrix[i][st]=matrix[i][ed];
    matrix[i][ed]=temp;
                st++;ed--;
            }
        }
                                        }
}
