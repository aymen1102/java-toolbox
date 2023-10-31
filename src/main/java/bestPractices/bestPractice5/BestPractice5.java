package bestPractices.bestPractice5;

import java.io.*;

/** Always close resources when you work with exception
 * in Java 7 and above, you can use the try-with-resources statement,
 * which automatically manages resource closure.
 * If you're not using Java 7 or if the resource doesn't implement AutoCloseable, 
 * you can use a finally block to ensure resources are closed.
 */
public class BestPractice5 {
    public static void main(String[] args) throws IOException {

        FileInputStream inputStream = null;

        /** bad habit */
        try {
            inputStream = new FileInputStream(new File("file.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            inputStream.close();
        }

        /** best practice */
        try(InputStream stream = new FileInputStream(new File("file.txt"))) {

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
