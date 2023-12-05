public class ProjectTask10 {

    //Write a program to print out duplicate elements from an Array of Strings
    public static void main(String[] args) {

        String [] arrNames = {"ada","precious","kate","zeenab","kate","marry","kate"};

        int dupNumames = 0;
        for (int i = 0; i < arrNames.length; i++) {
            if (arrNames[i].equals("kate")){
                dupNumames++;
                System.out.println(arrNames[i]+" "+dupNumames+" times");
            }
        }
    }
}
