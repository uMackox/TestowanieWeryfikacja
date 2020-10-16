package tasks;

import static org.junit.Assert.*;

import org.junit.Test;

public class RSExceptionTest {

	@Test
	public void test11() {
		RS flipflop = new RS();
		
		flipflop.SetR(true);
		flipflop.SetS(true);
		

		Exception exception = assertThrows(IllegalArgumentException.class,() -> flipflop.Run());
		String expected = "Inputs 1 and 1 are not allowed.";
		assertEquals(expected,exception.getMessage());
	}
}
