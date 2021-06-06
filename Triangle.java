package lab.exe;

import java.util.Scanner;
public class Triangle {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the width of the triangle:");
		double base = scanner.nextDouble();
		System.out.println("Enter the height of the trianle:");
		double height = scanner.nextDouble();
		double area =(base* height)/2;
		System.out.println("Area of tha triangle is "+ area);
		
		// TODO Auto-generated method stub

	}

}
