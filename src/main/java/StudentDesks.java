import java.util.Scanner;

class StudentDesks 
{
    public static void main(String[] args)
     {

        //Creates a new scanner for user input
        Scanner scanner = new Scanner(System.in);

        //Reads ints from user
        int group1S= scanner.nextInt();//# of students in 1st group
        int group2S= scanner.nextInt();//# of students in 2nd group
        int group3S= scanner.nextInt();//# of students in 3rd group

        int desks1= group1S/2 + group1S%2;// divides by 2 because 2 desks a student & mod by 2 in case of odd # of students 
        int desks2 = group2S/2+ group2S%2;
        int desks3= group3S/2+ group3S%2;

        System.out.print(desks1+desks2+desks3);//prints out the total # of desks needed by the school 
      

        // closing the scanner object
        scanner.close();
    }
}
