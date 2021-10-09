import java.util.List;
import java.util.ArrayList;

public class PrizePrinter {
	String name;
	List<String> features = new ArrayList<>();
	
	public void setName(String name) {
		this.name = name;
	}
	
	void setFeatures(List<String> features) {
		this.features = features;
	}
	
	void buildPrinter() {
		System.out.println("Adding components: Cartridge/Toner, Scanner and Connectivity");
	}
	
	void winnerName() {
		System.out.println("Getting winner's name from database");
	}
	
	void winnerAddress() {
		System.out.println("Getting winner's address from database");
	}
		
	public String toString() {
		StringBuffer reward = new StringBuffer();
		System.out.println("\nYou won a " + name + " including features:");
		
		for (String features : features) {
			System.out.println(" " + features);
		}
		System.out.println();
		return reward.toString(); 
	}
}