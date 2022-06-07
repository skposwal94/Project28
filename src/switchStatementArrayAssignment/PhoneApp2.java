package switchStatementArrayAssignment;

import java.util.Scanner;

public class PhoneApp2 {

	public static void main(String[] args) {     // Can be used if need to add any additional brands/products no further switch statements required
		
		String[] Samsung = { "S20", "S21", "Flip3", "Fold3" };
		String[] Google = { "Google Pixel 6", "Google Pixel 6 Pro", "Google Pixel Pro", "Google Pixel 5" };
		String[] Apple = { "Iphone12", "Iphone12 mini", "Iphone11", "Iphone11" };
		String[] phoneBrands = { "Samsung", "Google", "Apple" };
		String[][] phoneBrands2 = { Samsung, Google, Apple };               // 2D Array initialized to reduce code
		boolean brandAvailable = false;
		boolean productAvailable = false;

		Scanner scn = new Scanner(System.in);
		System.out.println("Hi user enter which phone brand you prefer: Samsung, Google or Apple");
		String phoneBrandSelected = scn.nextLine();

		for (int i = 0; i < phoneBrands.length; i++) {

			if (phoneBrandSelected.equals(phoneBrands[i])) {
				brandAvailable = true;
				System.out.println("\nBrand you have selecte is available");
				System.out.println("Products available");						// i value here gives row of the brand user selected 
				for (int j = 0; j < phoneBrands2[i].length; j++) {
					System.out.println(phoneBrands2[i][j]);
				}
				System.out.println("\nPlease select a product: ");
				String productWanted = scn.nextLine();							// keeping i constant we iterate through j to 
				for (int j = 0; j < phoneBrands2[i].length; j++) {				// print values for inside array and check if product available
					if (productWanted.equals(phoneBrands2[i][j])) {
						productAvailable = true;
						System.out.println("Product selected is: " + phoneBrands2[i][j]);
						break;
					}
				}
			}
		}

		if (!brandAvailable) {
			System.out.println("\nYour preferred phone brand is not available");
		} else if (!productAvailable) {												// boolean logic to indicate if brand or product not available
			System.out.println("\nPlease select a product from list");
		}
		scn.close();
	}
}
