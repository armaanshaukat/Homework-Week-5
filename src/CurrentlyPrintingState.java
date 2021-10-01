
public class CurrentlyPrintingState implements State {

	Printer printer;
	
	public CurrentlyPrintingState(Printer printer) {
		this.printer = printer;
	}

	public void startPrinting() {
		System.out.println("The printer is busy and currently finishing a job");
	}

	public void cancelPrinting() {
		System.out.println("The printer is cancelling the job");
		printer.setState(printer.getNoJobState());
	}

	public void printing() {
		System.out.println("The printer is already printing the job");
	}

	public void getPrintOut() {
		printer.print();
		if (printer.getPaper() > 0) {
			printer.setState(printer.getNoJobState());
		} else {
			System.out.println("Printer is out of paper, cannot continue with job");
			printer.setState(printer.getNoPaperState());
		}
	}

	public void addPaper() { }
	
	public String toString() {
		return "Printing is in progress, once complete, get your printouts";
	}
}