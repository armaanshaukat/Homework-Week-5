import java.util.ArrayList;
import java.util.List;

public abstract class PrinterBuilder {
	String name;
	List<String> features = new ArrayList<>();
	
	
	public abstract PrinterBuilder addScanner();
	public abstract PrinterBuilder addInkType();
	public abstract PrinterBuilder addConnectionType();
	
	public PrizePrinter create() {
		PrizePrinter prizePrinter = new PrizePrinter();
		prizePrinter.setName(this.name);
		prizePrinter.setFeatures(features);
		return prizePrinter;
	}	
}