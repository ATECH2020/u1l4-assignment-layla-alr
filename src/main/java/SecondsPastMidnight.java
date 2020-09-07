import java.util.Scanner;

class SecondsPastMidnight 
{
    public static void main(String[] args) 
    {

        //Creates a new scanner for user input
        Scanner scanner = new Scanner(System.in);

        //Reads int from user
        int number = scanner.nextInt();

        //Your code goes here
        int hours = number/3600;//3600 is the amount of seconds in an hour
        int mins = number/60;//60 is the amount of seconds in a minute
        System.out.print(hours+" "+mins);//displays the hours and minutes past since midnight
        // closing the scanner object
        scanner.close();
    }
}