import java.util.Scanner;

import java.util.Scanner;

public class ProjectTask1 {
    public static void main(String[] args) {

        //Create a program that uses an array to store a list of temperatures for a week,
        //and then uses a loop to find the highest and lowest temperature for the week.

        Scanner sc = new Scanner(System.in);

        int daysInwk = 7;
        int [] temperatres = new int[daysInwk];

        for (int i = 0; i < daysInwk; i++) {
            System.out.println("Enter temperatue for days in a week, day: "+(i+1));
            temperatres[i] = sc.nextInt();
        }
        int highestTemperature = temperatres[0];
        int lowestTemperature = temperatres[0];

        for (int i = 0; i < temperatres.length; i++) {
            int temp = temperatres[i];

            if (temp > highestTemperature){
                highestTemperature = temp;
            }
            if (temp < lowestTemperature) {
                lowestTemperature = temp;
            }
        }
        System.out.println("Highest temperature for the week: "+highestTemperature);
        System.out.println("Lowest temperature for the week: "+lowestTemperature);
    }
}
