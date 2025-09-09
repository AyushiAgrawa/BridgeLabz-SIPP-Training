package Generics.Day3_GenericsProgrammingElements;
import java.io.*;

public class StudentData {
    public static void main(String[] args) throws IOException {
        DataOutputStream dos = new DataOutputStream(new FileOutputStream("students.dat"));
        dos.writeInt(1);
        dos.writeUTF("Ashu");
        dos.writeDouble(9.5);
        dos.writeInt(2);
        dos.writeUTF("Mohit");
        dos.writeDouble(8.7);
        dos.close();

        DataInputStream dis = new DataInputStream(new FileInputStream("students.dat"));
        while(dis.available() > 0){
            System.out.println(dis.readInt() + " " + dis.readUTF() + " " + dis.readDouble());
        }
        dis.close();
    }
}
