package src;

import java.util.ArrayList;
import java.util.HashSet;

public class BooleanMatrix {
    void booleanMatrix(int matrix[][])
    {
       int row= matrix.length;
        HashSet<Integer> rowNumber=new HashSet<>();
        HashSet<Integer> columnNumber=new HashSet<>();


       for(int i=0;i<row;i++){
           for(int j=0;j<matrix[i].length;j++){
               if(matrix[i][j]==1){
                   rowNumber.add(i);
                   columnNumber.add(j);
               }
           }
       }

       for(int num: rowNumber){
           for(int j=0;j<matrix[num].length;j++){
               matrix[num][0]=1;
           }
       }
        for(int col: columnNumber){
            for(int j=0;j<matrix.length;j++){
                matrix[j][col]=1;
            }
        }

    }
}

class BooleanMatrixStarter {
    public static void main(String[] args) {
        BooleanMatrix booleanMatrix=new BooleanMatrix();

    }
}