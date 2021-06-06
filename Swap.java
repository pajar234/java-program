package lab.exe;

public class Swap {

	public static void main(String[] args) {
		
	int first = 120, second = 220,temporary;
	System.out.println("-- Before Swap--");
	System.out.println("First number = " + first);
	System.out.println("Second number = " + second);
	temporary = first;
	first = second;
	second = temporary;

	System.out.println("--After Swap--");
	System.out.println("First number = " + first);
	System.out.println("Second number = " + second);
	
	

	}

}
