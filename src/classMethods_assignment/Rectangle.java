package classMethods_assignment;

public class Rectangle {

	double length;
	double breadth;
	double area;

	double area(double length, double breadth) {

		System.out.println("The area of Rectangle with length " + length + " and breadth " + breadth + " is:");

		area = length * breadth;

		return area;
	}

}
