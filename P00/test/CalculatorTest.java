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
		
		double a = 10; //arrange/setting
		double b = 20;
		
		Calculator cal = new Calculator();
		double actual = cal.divide(a, b);  //act/run method
		
		double expected = 0.5;
		assertEquals(expected,actual,0.1); //assert
		
	}
	
	@Test(expected=java.lang.ArithmeticException.class) //testing for zero denominator
    public void testDivideByZero() {
           double a =20;
           double b = 0;
          
           Calculator cal = new Calculator();
           double actual = cal.divide(a, b);
           double expected = 0;
           assertEquals(expected, actual,0.1);
           
    }
		
	

	@After
	public void tearDown() throws Exception {
	}
	
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

}
