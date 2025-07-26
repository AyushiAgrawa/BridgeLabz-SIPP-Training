package Day4_DSAProgrammingElements.StringBufferAndStringBuilder;

public class ConcatenateStringsStringBuffer {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();
		String[] input = {"Apple", "Banana", "Orange", "Kiwi"};
		for(String s : input) {
			sb.append(s);
		}
		System.out.println(sb);
	}
}
