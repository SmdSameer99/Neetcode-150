package Matrix;

public class SetMatixZeros {

    public static void setZeroes(int [][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;


        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                if(matrix[i][j] == 0){


                    
                   for(int k=0; k<cols; k++){
                            if(matrix[i][k] == 0){
                                continue;
                            }
                            matrix[i][k] = -9999;
                   }
                   for(int k=0; k<rows; k++){
                     if(matrix[k][j] == 0){
                                continue;
                            }
                            matrix[k][j] = -9999;
                    }
                }
            }
             
        }


        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                if( matrix[i][j] == -9999){
                    matrix[i][j] = 0;
                }
                System.out.println(matrix[i][j] );
            }
        }
        System.out.println(matrix);
    }



    public static void main(String[] args) {
        int [][] matrix = {
            {0, 1, 2, 0},
            {3, 4, 5, 2},
            {1, 3, 1, 5}
        };

        setZeroes(matrix);

        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
    
}
