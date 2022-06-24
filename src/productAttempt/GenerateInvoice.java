package productAttempt;

public class GenerateInvoice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Product[] selectedProducts = new Product[3];
		Invoice invoice = new Invoice();

		double invoiceTotal = 0;

		selectedProducts[0] = new Product("Milk", 5.45, "Organic", 1);
		selectedProducts[1] = new Product("Bread", 2.0, "Whole wheat", 2);
		selectedProducts[2] = new Product("Butter", 5.45, "Organic", 2);

		// Invoice before tax
		invoiceTotal = invoice.calculateInvoiceTotal(selectedProducts);
		System.out.println("Total invoice before 13% tax: " + invoiceTotal);

		// Print the invoice total with tax
		double invoiceTotalWithTax = invoice.calculateTax(invoiceTotal, 13);
		System.out.println("Total invoice with 13% tax: " + invoiceTotalWithTax);
	}

}
