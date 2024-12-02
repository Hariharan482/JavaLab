public class MatrixPatternGenerator {
    private final int[][] resultPatternMatrix;

    public MatrixPatternGenerator(int sum){
        this.resultPatternMatrix=generateMatrixPattern(sum);
    }

    public void getPatternMatrix() {
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(this.resultPatternMatrix[i][j]+" ");
            }
            System.out.println();
        }
    }

    private int[][] copyMatrix(int[] baseMatrix){
        int[][] patternMatrix=new int[3][3];
        patternMatrix[0]=baseMatrix;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                patternMatrix[i][j] = baseMatrix[(i + j) % 3];
            }
        }
        return patternMatrix;
    }

    public int[][] generateMatrixPattern(int sum){
        int[] baseMatrix=new int[3];
        int baseValue=sum/3;
        int rem=sum%3;
        if(rem==0){
            baseMatrix[0]=baseValue+1;
            baseMatrix[1]=baseValue;
            baseMatrix[2]=baseValue-1;
        } else if (rem==1) {
            baseMatrix[0]=baseValue+2;
            baseMatrix[1]=baseValue;
            baseMatrix[2]=baseValue-1;
        }
        else{
            baseMatrix[0]=baseValue+1;
            baseMatrix[1]=baseValue-1;
            baseMatrix[2]=baseValue+2;
        }
        return this.copyMatrix(baseMatrix);
    }

}
