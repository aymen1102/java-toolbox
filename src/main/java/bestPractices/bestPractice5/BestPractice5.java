package bestPractices.bestPractice5;

import java.io.*;

public class BestPractice5 {
    public static void main(String[] args) {
        /** Always close resources when you work with exception*/
        /** bad habit */
        InputStream inputStream = null;
        try {
            inputStream = new FileInputStream(new File("filepath"));
            // some code here
            //inputStream.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            //inputStream.close();
        }

        /** best practice */
        try(InputStream stream = new FileInputStream(new File("filepath"))) {
            // some code here
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
