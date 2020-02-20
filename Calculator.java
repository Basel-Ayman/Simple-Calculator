public class Calculator implements ICalculator{
	public int add(int x, int y) {
		return x+y;
	}
	
	public float divide(int x, int y) {
		if (y == 0)
			throw new RuntimeException("Cannot divide by zero (0).");
		return x/y;
	}
}