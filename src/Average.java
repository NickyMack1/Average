import java.util.Scanner;
public class Average
{
    public static void main(String[] args)
    {
        int val1, val2, val3;
        double average;
        Scanner scan = new Scanner(System.in) ;


        // get three values from user
        System.out.println("Please enter three integers and " +
                "I will compute their average");


        val1 = scan.nextInt(); // Fill in the blank to read the first integer
        val2 = scan.nextInt(); // Fill in the blank to read the second integer
        val3 = scan.nextInt(); // Fill in the blank to read the third integer


        //compute the average
        average = (val1 + val2 + val3) / 3.0; // Fill in the blank to compute the average


        //print the average
        System.out.println("The average is " + average); // Fill in the blank to print the average


    }
}