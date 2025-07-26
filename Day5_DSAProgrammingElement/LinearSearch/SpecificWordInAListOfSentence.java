package Day5_DSAProgrammingElement.LinearSearch;

public class SpecificWordInAListOfSentence {

	public static void main(String[] args) {
		String[] arr = {"Hello World", "Hii Mohan" , "You ate Apple", "Is it Good for you?"};
		String word = "Apple";
		
		System.out.println(linearSearch(arr, word));
	}
	static String linearSearch(String[] arr, String word) {
		String type = "";
		for(String s : arr) {
			if(s.contains(word)) {
			    return "Found";
			}
		}
		return "Not Found";
	}

}
