package casting;

import java.util.Random;

public class RandomEmailGenerator {

	public static void main(String[] args) {

		Random random = new Random();

		String characters_that_can_be_used = "abcdefghijklmnopqrstuvwxyz1234567890";

		char[] carray = new char[random.nextInt(4, 16)];

		for (int i = 0; i < carray.length; i++) {

			carray[i] = characters_that_can_be_used.charAt(random.nextInt(0, characters_that_can_be_used.length() - 1));
		}

		String[] domain = { "@gmail.com", "@ymail.com", "@hotmail.com", "@yahoo.com", "@outlook.com" };

		System.out.println(String.valueOf(carray) + domain[random.nextInt(0, domain.length)]);

	}

}
