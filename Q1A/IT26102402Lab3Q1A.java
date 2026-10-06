import java.util.Scanner;
public class IT26102402Lab3Q1A{
	
	public static void main(String[]args){
		double PricePerKG, Quantity, TotaAmount;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the price of KG of rice:" );
		PricePerKG = input.nextDouble();
		
		System.out.print("Enter the number of KG s you want to buy:");
		Quantity =input.nextDouble();
		
		TotaAmount = PricePerKG*Quantity;
		
		System.out.println();
		System.out.println("The total amunt is:" +TotaAmount);
		}
	
}
