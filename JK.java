package tasks;

public class JK {
	private boolean J,K,Clk,Q=false,Q1=true;
	public void SetJ(boolean state) {
		this.J = state;
	}
	public void SetK(boolean state) {
		this.K = state;
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
		else if(!this.J && !this.K) {
			this.Q1 = !this.Q;
		}
		else if(this.J && !this.K) {
			this.Q = true;
			this.Q1 = false;
		}
		else if(!this.J && this.K) {
			this.Q = false;
			this.Q1 = true;
		}
		else {
			this.Q = !this.Q;
			this.Q1 = !this.Q;
		}
		return Boolean.toString(this.Q)+Boolean.toString(this.Q1);
	}
}
