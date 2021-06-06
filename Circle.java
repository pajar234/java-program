package lab.exe;
import java.util.Scanner;
public class Circle 
{
    static Scanner SC = new Scanner (System.in);
	public static void main(String args [] ) 
	{
		System.out.print ("Enter the radius : ");
		double radius = SC.nextDouble ();
		double area = Math.PI * (radius * radius);
		System.out.println("The area of circle is: " + area);
		double circumference= Math.PI * 2*radius;
		System.out.println( "The circumference of the circle is:"+circumference);
		

	}

}
