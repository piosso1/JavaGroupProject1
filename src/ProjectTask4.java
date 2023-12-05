public class ProjectTask4 {
    public static void main(String[] args) {

        //Create a 2D array of integers. Develop a program which will calculate the
        //sum of even and odd numbers for that array.

        int [][] numbers={
                {13,85,22,26},
                {20,35,40,41},
                {37,3,8,16},
                {55,66,7,9},
        };

        int sumOfOdd = 0;
        int sumOfEven = 0;

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                if (numbers[i][j]%2==0){
                    sumOfEven = sumOfEven+numbers[i][j];
                }else {
                    if (numbers[i][j]%2!=0){
                        sumOfOdd = sumOfOdd+numbers[i][j];
                    }
                }
            }
            
        }
        System.out.println("Sum of even numbers: " + sumOfEven);
        System.out.println("Sum of odd numbers: " + sumOfOdd);
    }
}
