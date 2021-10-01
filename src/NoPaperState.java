
public class NoPaperState implements State {

	Printer printer;
	
	public NoPaperState(Printer printer) {
		this.printer = printer;
	}

	public void startPrinting() {
		System.out.println("Printer cannot accept job until paper is refilled");
	}

	public void cancelPrinting() {
		System.out.println("Printer has no job that can be cancelled");
	}

	public void printing() {
		System.out.println("Printer cannot print until paper is added");	
	}

	public void getPrintOut() {
		System.out.println("Printer did not print a job, there is no printouts");	
	}

	public void addPaper() {
		printer.setState(printer.getNoJobState());	
	}

	public String toString() {
		return "Printer is out of paper";
	}
}