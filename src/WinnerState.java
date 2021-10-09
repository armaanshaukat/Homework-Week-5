import java.util.Random;

public class WinnerState implements State {
	Random randomPrinter = new Random();
	Printer printer;
	
	public WinnerState(Printer printer) {
		this.printer = printer;
	}
	
	public void startPrinting() {
		System.out.println("Preparaing your prize, printer cannot accept a job");
	}

	public void cancelPrinting() {
		System.out.println("Preparaing your prize, printer cannot accept a job");
	}

	public void printing() {
		System.out.println("You can get your prize after the job is complete");
	}

	public void getPrintOut() {
		printer.print();
		if (printer.getPaper() > 0) {
			System.out.println("\nYOU ARE A WINNER!  YOU WIN A FREE PRINTER (INK, LASER, OR LED)!");
			printer.setState(printer.getNoJobState());
		} else {
			System.out.println("Printer is out of paper, cannot continue with job");
			printer.setState(printer.getNoPaperState());
		}
		
		int winningSelection = randomPrinter.nextInt(3);
		
		if (winningSelection == 0) {
			PrinterBuilder inkBuilder = new InkPrinterBuilder();
			PrizePrinter ink = inkBuilder.addInkType().addScanner().addConnectionType().create();
			ink.winnerName();
			ink.winnerAddress();
			ink.buildPrinter();
			System.out.println(ink);
		}
		
		if (winningSelection == 1) {
			PrinterBuilder laserBuilder = new LaserPrinterBuilder();
			PrizePrinter laser = laserBuilder.addInkType().addScanner().addConnectionType().create();
			laser.winnerName();
			laser.winnerAddress();
			laser.buildPrinter();
			System.out.println(laser);
		}

		if (winningSelection == 2) {
			PrinterBuilder ledBuilder = new LEDPrinterBuilder();
			PrizePrinter led = ledBuilder.addInkType().addScanner().addConnectionType().create();
			led.winnerName();
			led.winnerAddress();
			led.buildPrinter();
			System.out.println(led);
		}
	}

	public void addPaper() {}

	public String toString() {
		return "You were randomly selected as a winner to obtain a free printer!";
	}
}
