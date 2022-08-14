package enumPackage;

public class EnumClass {

	enum values {

		VALUE1, VALUE2, VALUE3;
	}

	public static void main(String[] args) {

		System.out.println(values.VALUE1);
		System.out.println(values.VALUE2);
		System.out.println(values.VALUE3);

		System.out.println("");

		values v = values.VALUE1;

		System.out.println(v);

	}

}
