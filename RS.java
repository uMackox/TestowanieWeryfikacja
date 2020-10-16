package tasks;


public class RS {
	private boolean S,R,Q=false,Q1=true;
	public void SetS(boolean state) {
		this.S = state;
	}
	public void SetR(boolean state) {
		this.R = state;
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
		if (this.S && this.R) {
			throw new IllegalArgumentException("Inputs 1 and 1 are not allowed.");
		}
		else if(this.S && !this.R) {
			this.Q = true;
			this.Q1 = false;
		}
		else if(!this.S && this.R) {
			this.Q = false;
			this.Q1 = true;
		}
		else {
			this.Q1 = !this.Q;
		}
		
		return Boolean.toString(this.Q)+Boolean.toString(this.Q1);
	}
}
