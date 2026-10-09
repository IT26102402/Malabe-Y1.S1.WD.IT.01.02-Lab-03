import java.util.Scanner;
public class IT26102402Lab3Q2{
	public static void main(String[]args){
		double salary, OTAmount, OThours, OThourlyRate, totSalary;		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the monthly salary:" );
		salary = input.nextDouble();
		
		System.out.println("Enter the number of OT hours:" );
		OThours = input.nextDouble();
		System.out.println("Enter the OT hourly rate:" );
		OThourlyRate = input.nextDouble();
		
		OTAmount = OThours*OThourlyRate;
		totSalary = salary+OTAmount;
		
		System.out.println("The total salary including OT:" + totSalary);
	}
	
}