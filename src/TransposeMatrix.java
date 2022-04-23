package src;

public class TransposeMatrix {

    static void transpose(int matrix[][], int n)
    {
        int temp=0;
        for(int i=0;i< matrix.length;i++){
            for (int j = i; j < matrix[i].length; j++) {
                if(i!=j){
                    temp=matrix[i][j];
                    matrix[i][j]=matrix[j][i];
                    matrix[j][i]=temp;
                }
            }
        }

        for(int i=0;i< matrix.length;i++){
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");

            }
        }
    }
}

class TransposeMatrixStarter {
    public static void main(String[] args) {
        TransposeMatrix transposeMatrix=new TransposeMatrix();
        transposeMatrix.transpose(new int[][] {{1, 1, 1, 1},
                {2, 2, 2, 2},
                {3, 3, 3, 3},
                {4, 4, 4, 4}}, 4);
    }
}
