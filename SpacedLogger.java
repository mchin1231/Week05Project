package week5CodingAssignment;

public class SpacedLogger implements Logger {

	public void log(String first) {
		StringBuilder spacedOut = new StringBuilder();	
		for (int i = 0; i < first.length(); i++) {
			spacedOut.append(first.charAt(i)).append(" ");
			}
		System.out.println(spacedOut.toString());
		}
	
	
	public void error(String second) {
		StringBuilder spacedError = new StringBuilder();
		spacedError.append("ERROR: ");
		for (int i = 0; i < second.length(); i++) {
			spacedError.append(second.charAt(i)).append(" ");
		}
		System.out.println(spacedError.toString());
	}
	
}
