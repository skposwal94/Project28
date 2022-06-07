package switchStatementArrayAssignment;

import java.util.Scanner;

public class PhoneApp {

	public static void main(String[] args) {
		
		// Initializing three arrays for brands with product lists & one array with all brands
		// using boolean to provide output in case brand or a product not available

		String[] phoneBrands = { "Samsung", "Google", "Apple" };
		String[] Samsung = { "S20", "S21", "Flip3", "Fold3" };
		String[] Google = { "Google Pixel 6", "Google Pixel 6 Pro", "Google Pixel Pro", "Google Pixel 5" };
		String[] Apple = { "Iphone12", "Iphone12 mini", "Iphone11", "Iphone11" };
		boolean isBrandavailable = false;
		boolean isProductavailable = false;
		String phoneBrandSelected = "";
		String productSelected = "";

		Scanner scn = new Scanner(System.in);
		System.out.println("Hi user enter which phone brand you prefer: Samsung, Google or Apple");
		phoneBrandSelected = scn.nextLine();

		for (int i = 0; i < phoneBrands.length; i++) {

			if (phoneBrandSelected.equals(phoneBrands[i])) {                                  //  to check if specified brand is available
																					         	// using for loop to prevent iterating through all switch cases
				System.out.println("\nHi user we have " + phoneBrandSelected + " available");   // in case brand not available 

				switch (phoneBrandSelected) {                                         // using switch to launch array for each phone 
				case "Samsung": {													  // and printing products available using for loop
					System.out.println("Products available for Samsung are: ");		  
					for (int k = 0; k < Samsung.length; k++) {
						System.out.println(Samsung[k]);
					}
					System.out.println("\nWhich product would you like to buy");
					productSelected = scn.nextLine();									// getting i/p from user which product they want
					for (int l = 0; l < Samsung.length; l++) {							// running for loop to check if product available 
						if (Samsung[l].equals(productSelected)) {						// similar process followed for all brands
							System.out.println("Product selected: " + Samsung[l]);
							isProductavailable = true;
						}
					}
					if (isProductavailable == false) {									// boolean logic to print in case product not available 
						System.out.println("Select a Product from the list");
					}
					break;
				}

				case "Google": {
					System.out.println("Products available for Google are: ");
					for (int k = 0; k < Google.length; k++) {
						System.out.println(Google[k]);
					}
					System.out.println("\nWhich product would you like to buy");
					productSelected = scn.nextLine();
					for (int l = 0; l < Google.length; l++) {
						if (Google[l].equals(productSelected)) {
							System.out.println("Product selected: " + Google[l]);
							isProductavailable = true;
						}
					}
					if (isProductavailable == false) {
						System.out.println("Select a Product from the list");
					}
					break;
				}

				case "Apple": {
					System.out.println("Products available for Apple are: ");
					for (int k = 0; k < Apple.length; k++) {
						System.out.println(Apple[k]);
					}
					System.out.println("\nWhich product would you like to buy");
					productSelected = scn.nextLine();
					for (int l = 0; l < Apple.length; l++) {
						if (Apple[l].equals(productSelected)) {
							System.out.println("Product selected: " + Apple[l]);
							isProductavailable = true;
							break;
						}
					}
					if (isProductavailable == false) {
						System.out.println("Select a Product from the list");
					}
					break;
				}

				default:
					break;
				}

				isBrandavailable = true;
				break;
			}

		}

		if (isBrandavailable == false) {
			System.out.println("\nSorry " + phoneBrandSelected + " is not available");           // boolean logic to print in case brand not available 
		}

		scn.close();

	}

}
