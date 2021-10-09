
public class LaserPrinterBuilder extends PrinterBuilder {

	public LaserPrinterBuilder() {
		this.name = "Laser Printer";
	}
	
	public PrinterBuilder addScanner() {
		this.features.add("Two-sided scanner");
		return this;
	}
	
	public PrinterBuilder addInkType() {
		this.features.add("Laser toner cartridges");
		return this;
	}

	public PrinterBuilder addConnectionType() {
		this.features.add("Wired connection connectivity only");
		return this;
	}
}