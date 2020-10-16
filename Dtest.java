package tasks;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class Dtest {
	@Parameter(0)
	public boolean Clk;
	@Parameter(1)
	public boolean D;
	@Parameter(2)
	public boolean Q;
	@Parameter(3)
	public boolean expected;
	
	@Parameters
	public static Collection<Object[]> data(){
		Object[][] data = new Object[][] {
			{false,false,false,false},
			{false,false,true,true},
			{false,true,false,false},
			{false,true,true,true},
			{true,false,false,false},
			{true,false,true,false},
			{true,true,false,true},
			{true,true,true,true},
		};
		return Arrays.asList(data);
	}
	@Test
	public void testAllCases(){
		D flipflop = new D();
		flipflop.SetClk(Clk);
		flipflop.SetD(D);
		flipflop.SetQ(Q);
		flipflop.Run();
		assertTrue(flipflop.GetQ()==expected);
		assertTrue(flipflop.GetQ1()==!expected);
	}
}
