package Day5_ProgrammingElements.Level1;

public class NullPointerExceptionn {

	public static void main(String[] args) {
		 System.out.println("Demonstrating NullPointerException:");
	        try {
	            generateException();  
	        } catch (NullPointerException e) {
	            System.out.println("Exception caught in main: " + e.getMessage());
	        }
	        System.out.println("\nHandling NullPointerException using try-catch block:");
	        handleException();
	}
    public static void generateException() {
	        String text = null;  
	        System.out.println("Length of the string: " + text.length());
	}
    public static void handleException() {
	        String text = null; 
	        try {
	            System.out.println("Length of the string: " + text.length());
	        } catch (NullPointerException e) {
	            System.out.println("Caught NullPointerException: " + e.getMessage());
	        }
	  }
}
