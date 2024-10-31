package converter;

import java.util.Locale;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("What is the dollar price? ");
		double dollarPrice= sc.nextDouble();
		System.out.print("How many dollars will be bought? ");
		double quantity= sc.nextDouble();
		double total = CurrencyConverter.currencyConverter(quantity, dollarPrice);
		System.out.printf("Amount to be paid in reais = " + total);;
		 
		sc.close();
	}

}
