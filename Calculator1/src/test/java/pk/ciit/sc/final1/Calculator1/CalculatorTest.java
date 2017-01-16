package pk.ciit.sc.final1.Calculator1;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest {

	Calculator calc=new Calculator();
	@Test
	public void testFindMax() {
		int result=calc.findMax(4, 5, 8);
		assertEquals(8,result);
	}
	@Test
	public void testFindMax1() {
		int result=calc.findMax(-4,-8,-10); 
		//max=0 so the negative values would not be considered as 0 is greater than negatives.
		assertEquals(-4,result);
	}
	@Test
	public void testFindMax2() {
		int result=calc.findMax(4,8,-10);
		assertEquals(8,result);
	}
	@Test
	public void testSquare(){
		int result=calc.square(4);
		assertEquals(16,result);	
	}
	@Test(expected=IllegalArgumentException.class)
	public void testSquare1(){
		int result=calc.square(-3);
		assertEquals(9,result);	
	}
	@Test(expected=IllegalArgumentException.class)
	public void testSquare2(){
		int result=calc.square(0);
		assertEquals(0,result);	
	}
	
}
