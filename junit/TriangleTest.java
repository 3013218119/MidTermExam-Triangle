import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class TriangleTest {

	Triangle tri=null;
	@Before
	public void setUp() throws Exception {
		tri=new Triangle(3,3,3);
	}

	@Test
	public void testIsTriangle1() {
		assertEquals(false,tri.isTriangle(new Triangle(-1,2,3)));
	}
	
	@Test
	public void testIsTriangle2() {
		assertEquals(false,tri.isTriangle(new Triangle(1,-2,3)));
	}
	
	@Test
	public void testIsTriangle3() {
		assertEquals(false,tri.isTriangle(new Triangle(1,2,-3)));
	}
	
	@Test
	public void testIsTriangle4() {
		assertEquals(false,tri.isTriangle(new Triangle(1,2,3)));
	}
	
	@Test
	public void testIsTriangle5() {
		assertEquals(false,tri.isTriangle(new Triangle(1,3,2)));
	}
	
	@Test
	public void testIsTriangle6() {
		assertEquals(false,tri.isTriangle(new Triangle(3,2,1)));
	}

	@Test
	public void testGetBorders() {
		for(int i=0;i<3;i++)
		{
			assertEquals(3,tri.getBorders()[i]);
		}
	}
	
	@Test
	public void testGetType1() {
		assertEquals("Illegal",tri.getType(new Triangle(1,2,3)));
	}
	
	@Test
	public void testGetType2() {
		assertEquals("Regular",tri.getType(new Triangle(2,2,2)));
	}
	@Test
	public void testGetType3() {
		assertEquals("Isosceles",tri.getType(new Triangle(3,3,2)));
	}
	@Test
	public void testGetType4() {
		assertEquals("Isosceles",tri.getType(new Triangle(2,3,3)));
	}
	@Test
	public void testGetType5() {
		assertEquals("Isosceles",tri.getType(new Triangle(2,3,2)));
	}
	@Test
	public void testGetType6() {
		assertEquals("Scalene",tri.getType(new Triangle(3,4,5)));
	}

}
