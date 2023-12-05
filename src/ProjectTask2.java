public class ProjectTask2 {
    public static void main(String[] args) {


        //Create an array of integer values. After the array is created, calculate the
        //sum of all stored elements in that array.

        int[][] matrix={
                {58,10,3,9},
                {71,12,18,43},
                {5,83,98,62},
                {17,52,73,25}
        };
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                sum = sum+matrix[i][j];

            }
        }
        System.out.println(sum);
    }
}
