
public class InkPrinterBuilder extends PrinterBuilder {

	public InkPrinterBuilder() {
		this.name = "Ink Printer";
	}
	
	public PrinterBuilder addScanner() {
		this.features.add("One-sided glass scanner");
		return this;
	}
	
	public PrinterBuilder addInkType() {
		this.features.add("Black and color ink cartridiges ");
		return this;
	}

	public PrinterBuilder addConnectionType() {
		this.features.add("Wireless connection connectivity");
		return this;
	}
}