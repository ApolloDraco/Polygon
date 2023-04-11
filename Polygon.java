/* 
 *  Description: A Java Program for calculating the area of a polygon of given number of sides and length of side
*/

import java.util.Scanner;

public class Polygon {
  public static void main(String args[]) {
     Scanner sc = new Scanner(System.in);
     
     //Enter number of sides
     System.out.print("Enter the number of sides in polygon: ");
     int numberOfSides = 0;
     try {
        numberOfSides = sc.nextInt();
     } catch (Exception e) {
        System.out.println("Invalid input. Please enter a valid integer.");
        System.exit(0);
     }
     
     //Enter length of sides 
     System.out.print("Enter the length of sides in polygon: ");
     double lengthOfSide = 0;
     try {
        lengthOfSide = sc.nextDouble();
     } catch (Exception e) {
        System.out.println("Invalid input. Please enter a valid number.");
        System.exit(0);
     }
    
    double angle = Math.toRadians(180/numberOfSides);
    angle = Math.tan(angle);
    double area = ((lengthOfSide * lengthOfSide * numberOfSides)/(4 * angle));
    System.out.print("Area of polygon is: " + area);
  }
}
