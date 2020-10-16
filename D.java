package tasks;

public class D {
	private boolean D,Clk,Q=false,Q1=true;
	public void SetD(boolean state) {
		this.D = state;
	}
	public void SetClk(boolean state) {
		this.Clk =  state;
	}
	public void SetQ(boolean state) {
		this.Q = state;
		this.Q1 = !state;
	}
	public boolean GetQ() {
		return this.Q;
	}
	public boolean GetQ1() {
		return this.Q1;
	}
	
	public String Run() {
		if(!this.Clk) {
			this.Q1 = !this.Q;
		}
		else if(!this.D) {
			this.Q = false;
			this.Q1 = true;
		}
		else if(this.D) {
			this.Q = true;
			this.Q1 = false;
		}
		return Boolean.toString(this.Q)+Boolean.toString(this.Q1);
	}
}
