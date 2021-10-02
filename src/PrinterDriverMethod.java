
public class PrinterDriverMethod {

	public static void main(String[] args) {
		Printer printer = new Printer(200);
		
		System.out.println(printer);
		
		printer.startPrinting();
		printer.printing();
		System.out.println(printer);
		
		printer.startPrinting();
		printer.cancelPrinting();
		System.out.println(printer);
		
		printer.startPrinting();
		printer.printing();
		printer.startPrinting();
		printer.printing();
		System.out.println(printer);
		
		printer.addPaper(103);
		System.out.println(printer);
	}
}
