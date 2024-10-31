package converter;

public class CurrencyConverter {
	public static final double TAX = 0.06;
	
	public static double currencyConverter(double dollarPrice, double quantity) {
		return quantity * dollarPrice * (1.0 + TAX);
	}
}
