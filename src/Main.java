import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
// used to take in values from the user through the console
        Scanner in = new Scanner(System.in);

        int numStudents;
        double [] heights;
// define the array length
        System.out.println("how many students are in the class");
        numStudents = in.nextInt();

// enter height of students into the array
        heights = new double[numStudents];
        for (int i = 0; i < numStudents; i++)
        {
            System.out.println("enter their heights");
            heights[i] = in.nextDouble();
        }
// print out all elements of the array
        for (int i = 0; i < heights.length; i++) {
            System.out.println(heights[i] + " ");
        }

// check for the highest height
        double maxHeight = heights[0];
        for ( int i = 1; i <heights.length; i++)
        {
            if (maxHeight < heights[i])
            {
                maxHeight = heights[i];
            }
        }
// add the array elements
        double total = 0;
        for ( int i =0 ; i < heights.length; i++)
        {
            total += heights[i];
        }
// print out the results
        System.out.println("The tallest student is " + maxHeight);
        System.out.printf("the average height is %5.2f ", total/numStudents);
    }
}
