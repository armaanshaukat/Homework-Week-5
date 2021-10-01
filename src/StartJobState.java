
public class StartJobState implements State {

	Printer printer;
	
	public StartJobState(Printer printer) {
		this.printer = printer;
	}
	
	public void startPrinting() {
		System.out.println("Printer has acknowledged job and is preparing to print");
	}

	public void cancelPrinting() {
		System.out.println("Printer is cancelling job request");
		printer.setState(printer.getNoJobState());
	}

	public void printing() {
		System.out.println("Printing the job has started");
		printer.setState(printer.getCurrentlyPrintingState());
	}

	public void getPrintOut() {
		System.out.println("Printout is not ready at this time");
		
	}

	public void addPaper() { }
	
	public String toString() {
		return "Waiting to hit start conditions";
	}
}