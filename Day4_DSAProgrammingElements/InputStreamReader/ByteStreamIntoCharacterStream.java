package Day4_DSAProgrammingElements.InputStreamReader;
import java.io.*;
public class ByteStreamIntoCharacterStream {

	public static void main(String[] args) {
		try(InputStreamReader isr = new InputStreamReader(new FileInputStream("Filejava"), "UTF-8")){
			int i;
			while((i = isr.read()) != -1) {
				System.out.print((char) i);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
