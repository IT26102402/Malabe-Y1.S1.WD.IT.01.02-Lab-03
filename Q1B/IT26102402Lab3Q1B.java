import java.util.Scanner;
public class IT26102402Lab3Q1B{
	public static void main(String[]args){
		double pricePerKG, quantity, amountToPay, totalAmount, discount;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the price of 1KG of rice:" );
		pricePerKG = input.nextDouble();
		
		System.out.print("Enter the number of kilograms:" );
		quantity = input.nextDouble();
		totalAmount = pricePerKG*quantity;
		
		discount = 0.10;
		
		amountToPay = totalAmount-(totalAmount*discount);
		System.out.println("Total amount with 10% discount is:"+ amountToPay);
	
    }
}