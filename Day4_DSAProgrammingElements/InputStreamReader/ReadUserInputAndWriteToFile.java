package Day4_DSAProgrammingElements.InputStreamReader;
import java.io.*;
public class ReadUserInputAndWriteToFile {

	public static void main(String[] args) {
		String file = "Filejava";
		
		try{
			InputStreamReader isr = new InputStreamReader(System.in);
			BufferedReader br = new BufferedReader(isr);
			
			FileWriter fw = new FileWriter(file);
			BufferedWriter bw = new BufferedWriter(fw);
			
			 System.out.println("Enter text to write to the file (type 'exit' to stop):");

			String line;
			while(!(line=br.readLine()).equalsIgnoreCase("exit")){
				bw.write(line);
				bw.newLine();
			}
			
			bw.close();
			br.close();
			System.out.println("User input has been written to " + file);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
