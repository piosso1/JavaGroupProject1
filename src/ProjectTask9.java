public class ProjectTask9 {

    //Write a java program to find the second largest number in the array?

    public static void main(String[] args) {

        int [] arrNum = {10,35,12,3,5,14,30,20};

        int highest = arrNum[0];
        int secondhighest = arrNum[0];

        for (int i = 0; i < arrNum.length; i++) {
            if (arrNum[i] > highest){
                secondhighest = highest;
                highest = arrNum[i];
            } else if (arrNum[i] > secondhighest) {
                secondhighest = arrNum[i];
            }
        }
        System.out.println("Second largest number: "+secondhighest);
    }
}
