import java.util.Scanner;

class AnalogClock {
    public static void main(String[] args) {

        //Creates a new scanner for user input
        Scanner scanner = new Scanner(System.in);

        //Reads ints from user
        int inputDegree= scanner.nextInt();
        
        int hour= inputDegree/30;//30 degrees in an hour, finds the hour
        int minDegree= inputDegree -(hour*30);//finds the leftover degrees after the hour mark 
         minDegree= minDegree*2;// multiplies leftover degrees by 2 since there are 2 minutes/degree in hour hand
        minDegree= minDegree*6;//multiplies those degrees by 6 since there are 6 degrees/minute in minute hand

        System.out.print(minDegree);

        // closing the scanner object
        scanner.close();
    }
}
