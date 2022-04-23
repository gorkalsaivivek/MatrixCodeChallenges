package src;

public class AddingTwoMatrices {

    static int[][] sumMatrix(int A[][], int B[][])
    {
        int[][] result=new int[A.length][A[0].length];

        if(A.length!=B.length || A[0].length!=B[0].length ){
            return new int[][]{{-1}};
        }
        for(int i=0;i<A.length;i++){
            for(int j=0;j<A[i].length;j++){
                result[i][j]=A[i][j] + B[i][j];
            }
        }
        return result;
    }
}
class AddingTwoMatricesStarter {
    public static void main(String[] args) {
        AddingTwoMatrices  addingTwoMatrices=new AddingTwoMatrices();
       // addingTwoMatrices.sumMatrix
    }
}