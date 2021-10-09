
public class LEDPrinterBuilder extends PrinterBuilder {

	public LEDPrinterBuilder() {
		this.name = "LED Printer";
	}
	
	public PrinterBuilder addScanner() {
		this.features.add("No scanner included");
		return this;
	}
	
	public PrinterBuilder addInkType() {
		this.features.add("LED ink cartridge");
		return this;
	}

	public PrinterBuilder addConnectionType() {
		this.features.add("Wireless and wired connection connectivity");
		return this;
	}
}