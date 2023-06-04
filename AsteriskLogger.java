package week5CodingAssignment;

public class AsteriskLogger implements Logger {

	public void log(String message) {
	System.out.println("***" + message + "***");
	}

	public void error(String message) {
	System.out.println("*******************" + "\n***Error: " + message + "***" + "\n*******************");
	}
}
