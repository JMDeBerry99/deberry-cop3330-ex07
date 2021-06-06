/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 first_name last_name
 */
package oop.exercises;
import java.util.Scanner;

public class AreaOfRectangularRoom
{
    public static void main( String[] args )
    {
        final double conversion = 0.09290304;
        Scanner in = new Scanner(System.in);

        System.out.print("What is the length of the room in feet? ");
        String input = in.nextLine();
        int length = Integer.parseInt(input);
        System.out.print("What is the width of the room in feet? ");
        input = in.nextLine();
        int width = Integer.parseInt(input);

        System.out.printf("You entered dimensions of %d feet by %d feet.\n", length, width);

        int areaFeet = length * width;
        double areaMeters = areaFeet * conversion;

        System.out.printf("The area is\n%d square feet\n%.3f square meters", areaFeet, areaMeters);

    }
}
