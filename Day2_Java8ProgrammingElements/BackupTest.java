package JavaFeature.Day2_Java8ProgrammingElements;

import java.io.*;

class BackupData implements Serializable {
    String data;
    BackupData(String data) { this.data = data; }
}

public class BackupTest {
    public static void main(String[] args) throws Exception {
        BackupData bd = new BackupData("Important Info");
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("backup.dat"));
        oos.writeObject(bd);
        oos.close();
        System.out.println("Data serialized");
    }
}
