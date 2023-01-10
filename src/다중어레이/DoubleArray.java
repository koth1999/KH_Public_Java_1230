package 다중어레이;
// 2차원 배열 : 행과 열이 존재
public class DoubleArray {
    public static void main(String[] args) {
        int[][] arr = new int[2][3];
        int k = 10;
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                arr[i][j]=k;
                k+=10;
            }
        }
        for(int[] row : arr) {
            for(int e : row){
               System.out.print(e+" ");
            }
            System.out.println();
        }

    }
}
