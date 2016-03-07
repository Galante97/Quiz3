package mainPackage;

public class Triangle extends GeometricObject {
	private double side1 = 1;
	private double side2 = 1;
	private double side3 = 1;

	public Triangle() {
	}

	/**
	 * Constructor to make a simple Triangle
	 * @param side1
	 * @param side2
	 * @param side3
	 */
	public Triangle(double side1, double side2, double side3) {
		super();
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}

	public double getSide1() {
		return side1;
	}

	public void setSide1(double side1) {
		this.side1 = side1;
	}

	public double getSide2() {
		return side2;
	}

	public void setSide2(double side2) {
		this.side2 = side2;
	}

	public double getSide3() {
		return side3;
	}

	public void setSide3(double side3) {
		this.side3 = side3;
	}

	/**
	 * Returns the perimeter of the triangle
	 */
	@Override
	public double getPerimeter() {
		double perimeter;
		perimeter = side1 + side2 + side3;
		return perimeter;
	}

	/**
	 * Returns the area of the triangle
	 */
	@Override
	public double getArea() {
		double hP = (side1 + side2 + side3) / 2;
		double area = Math.sqrt(hP * (hP - side1) * (hP - side2) * (hP - side3));
		return area;
	}

	@Override
	public String toString() {
		return "Triangle [side1=" + side1 + ", side2=" + side2 + ", side3=" + side3 + "]";
	}

}
