package week5CodingAssignment;

public class App {

	public static void main(String[] args) {
		Logger asteriskLogger = new AsteriskLogger();
		Logger spacedLogger = new SpacedLogger();
		
		asteriskLogger.log("Cheese");
		asteriskLogger.error("Cheese");
		
		spacedLogger.log("Spread");
		spacedLogger.error("Cheese");
	}

}
