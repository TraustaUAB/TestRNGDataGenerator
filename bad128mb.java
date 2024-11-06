import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Random;
 
public class BadDataGenerator {
    public static void main(String[] args) {
        try (FileOutputStream fos = new FileOutputStream("bad128java.dat")) {
            Random random = new Random();
            byte[] buffer = new byte[1024 * 1024]; // 1 MB buffer
 
            for (int i = 0; i < 128; i++) { // Write 128 MB
                random.nextBytes(buffer);
                fos.write(buffer);
            }
            System.out.println("Bad data generated: bad128java.dat");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


