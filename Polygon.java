/* 
 *  Description: A Java Program for calculating the area of a polygon of given number of sides and length of side
*/

import java.util.Scanner;
public class Polygon {
  public static void main(String args[]) {
     Scanner sc=new Scanner(System.in);
     
     //Enter number of sides
     System.out.print("Enter the number of sides in polygon:");
     double n=sc.nextDouble();
     
     //Enter length of sides 
     System.out.print("Enter the length of sides in polygon:");
     double ln=sc.nextDouble();
    
    double angle= Math.toRadians(180/n);
    angle=Math.tan(angle);
    double area=((ln*ln*n)/(4*angle));
    System.out.print("Area of polygon is:"+area);
  }
}
