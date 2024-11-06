import java.io.FileOutputStream;
import java.io.IOException;
import java.security.SecureRandom;
 
public class GoodDataGenerator {
    public static void main(String[] args) {
        try (FileOutputStream fos = new FileOutputStream("good128java.dat")) {
            SecureRandom secureRandom = new SecureRandom();
            byte[] buffer = new byte[1024 * 1024]; // 1 MB buffer
 
            for (int i = 0; i < 128; i++) { // Write 128 MB
                secureRandom.nextBytes(buffer);
                fos.write(buffer);
            }
            System.out.println("Good data generated: good128java.dat");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


