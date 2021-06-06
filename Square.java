package lab.exe;
import java.util.Scanner;
public class Square {

	public static void main(String[] args) {
		System.out.println("Enter  side of  square:");
		Scanner scanner = new Scanner(System.in);
		double side = scanner.nextDouble();
		double area = side*side;
		System.out.println("Area of square is :"+area);
		
		// TODO Auto-generated method stub

	}

}
