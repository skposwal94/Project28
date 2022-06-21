package classPrograms;

public class ProductMain {

	public static void main(String[] args) {
		
		
		Products[] productsArray = new Products[10];

		productsArray[0] = new Products("P0", 1.0, "This is P0");
		productsArray[1] = new Products("P1", 2.0, "This is P1");
		productsArray[2] = new Products("P2", 3.0, "This is P2");
		productsArray[3] = new Products("P3", 4.0, "This is P3");
		productsArray[4] = new Products("P4", 5.0, "This is P4");
		productsArray[5] = new Products("P5", 6.0, "This is P5");
		productsArray[6] = new Products("P6", 7.0, "This is P6");
		productsArray[7] = new Products("P7", 8.0, "This is P7");
		productsArray[8] = new Products("P8", 9.0, "This is P8");
		productsArray[9] = new Products("P9", 10.0, "This is P9");
		
		
		ProductsInvoice newP = new ProductsInvoice();
		newP.invoice(productsArray[7], 9);
	

	}

}
