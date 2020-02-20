import org.junit.Assert;
import org.junit.Test;

public class CalculatorTests {
	@Test
	public void addTest() {
		Calculator calc = new Calculator();
		int actual = calc.add(-2, -2);
		Assert.assertEquals(-4,actual);
	}
	@Test
	public void divideTest() {
		Calculator calc = new Calculator();
		float actual = calc.divide(10, -5);
		Assert.assertEquals(-2.0, actual, 0);
	}
	@Test(expected = RuntimeException.class)
	public void divideTest1() {
		Calculator calc = new Calculator();
		calc.divide(10, 0);
	}
}