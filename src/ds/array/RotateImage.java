package ds.array;

public class RotateImage {

    public static void main(String[] args) {

        int[][] a = {{1,2,3},{4,5,6},{7,8,9}};

        System.out.println(rotateImage(a));
    }

    static int[][] rotateImage(int[][] a) {
        int N  = a.length;

        for(int i = 0 ; i < N ; i++){
            for(int j = i ;j< N;j++){

                int temp  = a[i][j];
                a[i][j] = a[j][i];
                a[j][i] = temp;

            }
        }

        System.out.println(a);

        for(int i = 0 ; i < N; i++){
            for(int j = 0 ; j < (N/2); j++){

                int temp = a[i][j];
                a[i][j] = a[i][N-1-j];
                a[i][N-1-j] = temp;


            }
        }

        return a;

    }

}
