package productAttempt;

public class Invoice {

	double calculateInvoiceTotal(Product[] product) {
		double total = 0;

		for (int i = 0; i < product.length; i++) {

			total += product[i].pricePerunit * product[i].quantity;

		}

		return total;
	}

	// 13% tax calculation
	// Add a method calculateTax (13%) and provide the totalAmount including Tax.

	double calculateTax(double totalamount, double tax) {

		return (totalamount * (100 + tax) / 100);

	}

}
