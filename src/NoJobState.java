
public class NoJobState implements State {

	Printer printer;
	
	public NoJobState(Printer printer) {
		this.printer = printer;
	}
	
	public void startPrinting() {
		System.out.println("Sending job request to printer");
		printer.setState(printer.getStartJobState());
	}

	public void cancelPrinting() {
		System.out.println("The printer has no jobs");
	}

	public void printing() {
		System.out.println("Printer cannot print until accepting and starting a job");	
	}

	public void getPrintOut() {
		System.out.println("Printer has no printed any jobs");
		
	}

	public void addPaper() { }
	
	public String toString() {
		return "Printer is ready recieve a job request";
	}
}