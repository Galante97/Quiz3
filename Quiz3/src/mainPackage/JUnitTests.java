package mainPackage;

import static org.junit.Assert.*;

import org.junit.Test;

public class JUnitTests {

	@Test
	public void testGetPerimeter() {
		Triangle Triangle = new Triangle();
		double result = Triangle.getPerimeter();
		assertEquals(3.0, result, 0.001);
	}

	@Test
	public void testGetArea() {
		Triangle Triangle = new Triangle();
		double result = Triangle.getArea();
		assertEquals(0.43301, result, 0.001);

	}

}
