import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CalculatorTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {		
	}
	
	@Test
	public void testAdd() {
		//fail("Not yet implemented");
		
		int a = 1234;
		int b = 8765;
		
		Calculator cal = new Calculator();
		int actual = cal.add(a, b);
		
		int expected = 9999;
		assertEquals(expected,actual);
		
	}
	
	@Test
	public final void testSubtract() {
		
		int a = 9876;
		int b = 4321;
		
		Calculator cal = new Calculator();
		int actual = cal.subtract(a, b);
		
		int expected = 5555;
		assertEquals(expected, actual);
		
	}
	
	@Test
	public void testMultiple() {
		
		int a = 10;
		int b = 20;
		
		Calculator cal = new Calculator();
		int actual = cal.multiply(a, b);
		
		int expected = 200;
		assertEquals(expected,actual);
		
		
	}
	
	
	@Test
	public void testDivide() {
		
		int a = 20; //arrange/setting
		int b = 10;
		
		Calculator cal = new Calculator();
		int actual = cal.divide(a, b);  //act/run method
		
		int expected = 2;
		assertEquals(expected,actual); //assert
		
	}
	
	@Test(expected=java.lang.ArithmeticException.class) //testing for zero denominator
    public void testDivideByZero() {
           int a =20;
           int b = 0;
          
           Calculator cal = new Calculator();
           int actual = cal.divide(a, b);
           int expected = 0;
           assertEquals(expected, actual);
           
    }
		
	

	@After
	public void tearDown() throws Exception {
	}
	
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

}
