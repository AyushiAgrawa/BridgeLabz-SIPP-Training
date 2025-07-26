package Day4_DSAProgrammingElements.FileReader;
import java.io.*;
public class CountOccurenceOfWord {

	public static void main(String[] args) {
		String file = "Filejava";
		String target = "Java";
		int count=0;
		
		try(BufferedReader br = new BufferedReader(new FileReader(file))){
			String line;
			while((line = br.readLine()) != null) {
				String[] words = line.split("\\s+");
				for(String word: words) {
					if(word.equals(target)) {
						count++;
					}
				}
			}
			System.out.println("Word '"+ target+ "' occured "+ count);
		}catch(IOException e) {
			e.printStackTrace();
		}
	}

}
