import java.util.Scanner;

class Timestamps {
    public static void main(String[] args) {

        //Creates a new scanner for user input
        Scanner scanner = new Scanner(System.in);

        //Reads ints from user
        int hours1 = scanner.nextInt();
        int minutes1 = scanner.nextInt();
        int seconds1 = scanner.nextInt();
        int hours2 = scanner.nextInt();
        int minutes2 = scanner.nextInt();
        int seconds2 = scanner.nextInt();

        /*
         *  your code goes here
         */

         int deltaH= hours2-hours1;//difference btw 1st and second hour
         int deltaM= minutes2-minutes1;//diff between 1st and second min
         int deltaS= seconds2-seconds1;//diff between 1st and second sec

        deltaH*=3600;// converting the difference of the hours to seconds

        deltaM*=60;//converting the difference of the minutes to seconds
        
        //deltaS doesn't need to be multiplied bc it's already in seconds

        System.out.print(deltaH+deltaM+deltaS);//printing the sum of all the seconds

        // closing the scanner object
        scanner.close();
    }
}