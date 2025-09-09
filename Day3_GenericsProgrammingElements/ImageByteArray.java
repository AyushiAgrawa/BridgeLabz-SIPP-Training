package Generics.Day3_GenericsProgrammingElements;
import java.io.*;

public class ImageByteArray {
    public static void main(String[] args) throws IOException {
        File file = new File("image.jpg");
        FileInputStream fis = new FileInputStream(file);
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        byte[] buffer = new byte[1024];
        int bytesRead;
        while ((bytesRead = fis.read(buffer)) != -1) {
            bos.write(buffer, 0, bytesRead);
        }
        fis.close();
        byte[] imageData = bos.toByteArray();
        bos.close();
        ByteArrayInputStream bis = new ByteArrayInputStream(imageData);
        FileOutputStream fos = new FileOutputStream("image_copy.jpg");
        while ((bytesRead = bis.read(buffer)) != -1) {
            fos.write(buffer, 0, bytesRead);
        }
        bis.close();
        fos.close();
    }
}
