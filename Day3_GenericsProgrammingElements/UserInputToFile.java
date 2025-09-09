package Generics.Day3_GenericsProgrammingElements;
import java.io.*;

public class UserInputToFile {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("Enter name: ");
            String name = br.readLine();
            System.out.print("Enter age: ");
            int age = Integer.parseInt(br.readLine());
            System.out.print("Enter favorite language: ");
            String language = br.readLine();
            FileWriter fw = new FileWriter("source.txt");
            fw.write(name + "\n" + age + "\n" + language);
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
