public class ProjectTask8 {

    //Maximum and minimum number in the array

    public static void main(String[] args) {

        int [] arrNum = {10,35,12,3,5,14,20};
        int maxArr = arrNum[0];
        int minArr = arrNum[0];

        for (int i = 0; i < arrNum.length; i++) {
            if (arrNum[i] > maxArr){
                maxArr = arrNum[i];
            }
            if (arrNum[i] < minArr){
                minArr = arrNum[i];
            }
        }
        System.out.println("Maximum number: "+maxArr);
        System.out.println("Maximum number: "+minArr);
        }


    }
