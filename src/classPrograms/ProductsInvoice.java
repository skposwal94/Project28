package classPrograms;

public class ProductsInvoice {

	
	void invoice(Products p, int quantity) {
		
		System.out.println("Total amount for "+ p.productName+ " for quanitity "+ quantity  +" is "  
		+ p.priceperunit*quantity);
		
	}
}
