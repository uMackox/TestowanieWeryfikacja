package tasks;

public class T {
	private boolean T,Clk,Q=false,Q1=true;
	public void SetT(boolean state) {
		this.T = state;
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
		else if(!this.T) {
			this.Q1 = !this.Q;
		}
		else if(this.T) {
			this.Q = !this.Q;
			this.Q1 = !this.Q;
		}
		return Boolean.toString(this.Q)+Boolean.toString(this.Q1);
	}
}
