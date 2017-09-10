package practices;
import org.testng.annotations.Test;

public class MyTest {
	@Test(expectedExceptions = ArithmeticException.class)
	public void divisionWithException() {
		int i = 1 / 6;
	}
}
