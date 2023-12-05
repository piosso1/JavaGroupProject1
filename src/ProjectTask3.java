public class ProjectTask3 {
    public static void main(String[] args) {

        //Create a 2D array or integer type where you will store odd and even
        //numbers. Develop a program which will identify/print the even numbers
        //only.

        int [][] numbers={
                {13,85,22,26},
                {20,35,40,41},
                {37,3,8,16},
                {55,66,7,9},
        };
        for (int i = 0; i <numbers.length ; i++) {
            for (int x = 0; x < numbers[i].length; x++){
                if (numbers[i][x]%2==0){
                    System.out.print(numbers[i][x]+" ");
                }
            }
            System.out.println();
        }
    }
}
