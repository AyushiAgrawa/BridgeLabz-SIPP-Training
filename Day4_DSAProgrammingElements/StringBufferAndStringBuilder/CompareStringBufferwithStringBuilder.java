package Day4_DSAProgrammingElements.StringBufferAndStringBuilder;

public class CompareStringBufferwithStringBuilder {

	public static void main(String[] args) {
		
		String input = "Hello World";

		StringBuilder sbuilder = new StringBuilder();
        long startBuilder = System.nanoTime();
        for (int i = 0; i < 100000; i++) {
            sbuilder.append(input);
        }
        long endBuilder = System.nanoTime();
        System.out.println("Time taken by StringBuilder: " + (endBuilder - startBuilder) + " ns");

        StringBuffer sbuffer = new StringBuffer();
        long startBuffer = System.nanoTime();
        for (int i = 0; i < 100000; i++) {
            sbuffer.append(input);
        }
        long endBuffer = System.nanoTime();
        System.out.println("Time taken by StringBuffer: " + (endBuffer - startBuffer) + " ns");
	}

}
