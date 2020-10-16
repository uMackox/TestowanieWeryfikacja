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
public class JKtest {
	@Parameter(0)
	public boolean Clk;
	@Parameter(1)
	public boolean J;
	@Parameter(2)
	public boolean K;
	@Parameter(3)
	public boolean Q;
	@Parameter(4)
	public boolean expected;
	
	@Parameters
	public static Collection<Object[]> data(){
		Object[][] data = new Object[][] {
			{false,false,false,false,false},
			{false,false,false,true,true},
			{false,false,true,false,false},
			{false,false,true,true,true},
			{false,true,false,false,false},
			{false,true,false,true,true},
			{false,true,true,false,false},
			{false,true,true,true,true},
			{true,false,false,false,false},
			{true,false,false,true,true},
			{true,false,true,false,false},
			{true,false,true,true,false},
			{true,true,false,false,true},
			{true,true,false,true,true},
			{true,true,true,false,true},
			{true,true,true,true,false},
		};
		return Arrays.asList(data);
	}
	
	@Test
	public void testAllCases(){
		JK flipflop = new JK();
		flipflop.SetClk(Clk);
		flipflop.SetJ(J);
		flipflop.SetK(K);
		flipflop.SetQ(Q);
		flipflop.Run();
		assertTrue(flipflop.GetQ()==expected);
		assertTrue(flipflop.GetQ1()==!expected);
	}
}
