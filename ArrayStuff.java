/*
 * Programmer:
 * Date:
 * Purpose:
 */

import java.util.Scanner;

public class ArrayStuff {
    public static void main (String[] args) {
        // Create the input scanner
        Scanner input = new Scanner(System.in);

        // PART A

        // TODO: Create integer array called "ages" with length 5.
        int [] ages = new int [5];
        
        // TODO: Change the 3rd element of "ages" to be 18
        ages [2] = 18;


        // TODO: Change the first element of "ages" to be an integer entered by the user
        System.err.println("Enter an integer:");
        ages [0] = input.nextInt();
        
        // TODO: Change the last element of "ages" to be the first element squared
        ages [4] = (int) Math.pow(ages [0], 2);


        // TODO: Print all of the elements of "ages", one per line
        System.out.println(ages[0]);
        System.out.println(ages[1]);
        System.out.println(ages[2]);
        System.out.println(ages[3]);
        System.out.println(ages[4]);


        // PART B

        // TODO: Create AND initialize an array called "planets" that holds the
        // names of the planets in order from closest to the sun to farthest.
        // NOTE: Pluto is NOT a planet.
        String [] planets = { "Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune"};
       

        // TODO: Print the first letter of the 7th planet from the sun
        System.out.println(planets[6].charAt(0));


        // TODO: Change the name of our planet to be a line of text that the user inputs
        System.err.println("What do you want to rename Earth to be?");
        planets[2] = input.next();


        // TODO: Replace the first planet with the planet at index 2, but with all
        // upper case letters.
        planets[0] = planets[2].toUpperCase();
      


        // TODO: Print all of the elements of "planets" in reverse order.
        System.out.println(planets[7]);
        System.out.println(planets[6]);
        System.out.println(planets[5]);
        System.out.println(planets[4]);
        System.out.println(planets[3]);
        System.out.println(planets[2]);
        System.out.println(planets[1]);
        System.out.println(planets[0]);

    }
}
