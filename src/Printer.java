
public class Printer {

	State currentlyPrintingState;
	State noPaperState;
	State noJobState;
	State startJobState;
	
	State state;
	int paper = 0;
	
	public Printer(int currentPaper) {
		currentlyPrintingState = new CurrentlyPrintingState(this);
		noJobState = new NoJobState(this);
		startJobState = new StartJobState(this);
		noPaperState = new NoPaperState(this);
		
		this.paper = currentPaper;
		
		
		if (currentPaper > 0) {
			state = noJobState;
		} else {
			state = noPaperState;
		}
	}
	
	public void startPrinting() {
		state.startPrinting();
	}
	
	public void cancelPrinting() {
		state.cancelPrinting();
	}
	
	public void printing() {
		state.printing();
		state.getPrintOut();
	}
	
	void print() {
		System.out.println("Your job is printing");
		if (paper > 0) {
			paper = paper - 1;
		}
	}
	
	int getPaper() {
		return paper;
	}
	
	void addPaper(int paper) {
		this.paper += paper;
		System.out.println("Paper was added to the printer, you have " + this.paper + " sheets of paper");
		state.addPaper();
	}
	
	void setState(State state) {
		this.state = state;
	}
	
	public State getState() {
		return state;
	}
	
	public State getCurrentlyPrintingState() {
		return currentlyPrintingState;
	}
	
	public State getStartJobState() {
		return startJobState;
	}
	
	public State getNoJobState() {
		return noJobState;
	}
	
	public State getNoPaperState() {
		return noPaperState;
	}
	
	public String toString() {
		StringBuffer result = new StringBuffer();
		
		
		return result.toString();
	}
}
