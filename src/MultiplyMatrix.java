package src;

import java.util.ArrayList;

public class MultiplyMatrix {

    static int[][] multiplyMatrix(int A[][], int B[][])
    {
        int result=0;
        ArrayList<Integer> integers=new ArrayList<>();
        int[][] resultMatrix=new int[1][1];
        for(int i=0;i<A.length;i++){
            for(int j=0;j<B[j].length;j++){
                result+=A[i][j] * B[j][i] ;
            }
            integers.add(result);
            result=0;
        }
        return resultMatrix;
    }
}

class MultiplyMatrixStarter {
    public static void main(String[] args) {
        MultiplyMatrix multiplyMatrix=new MultiplyMatrix();
        multiplyMatrix.multiplyMatrix(new int[][]{
                {4, 8},
                {0, 2},
                {1, 6}},new int[][] {{5, 2},
                {9, 4}});

    }
}
