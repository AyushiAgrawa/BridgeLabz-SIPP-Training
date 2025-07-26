package Day4_DSAProgrammingElements.FileReader;
import java.util.*;
import java.io.*;
public class ReadFileUsingFileReader {

	public static void main(String[] args) {
		String file = "Filejava";
		
		try(BufferedReader br = new BufferedReader(new FileReader(file))){
			String line;
			while((line = br.readLine()) != null) {
				System.out.println(line);
			}
		}catch(IOException e) {
			e.printStackTrace();
		}
				
	}

}
