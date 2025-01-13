import java.util.Scanner;

public class Constants{
	
	static final double pi = 3.142;
	
	static int age = 50;
	
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter radius: ");
		int radius = scan.nextInt();
		
		Constants.area(radius);
		
	}
	public static void area(int radius){
		double areaOfCircle = pi * radius*radius;
		System.out.printf("The area of the circle is %.2f",areaOfCircle);
		
		Constants.check();
	}
	
	public static void check(){
		if(age >= 18)
			System.out.println("Yes , you are an adult");
		
		else
			System.out.println("You are still a teenager");
	}
}