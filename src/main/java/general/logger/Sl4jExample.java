package general.logger;

import lombok.extern.slf4j.Slf4j;

import java.io.IOException;
import java.util.logging.Level;

@Slf4j
public class Sl4jExample {
    public static void main(String[] args) throws SecurityException, IOException {
        log.info("Logger Name: " + log.getName());
        log.warn("Can cause ArrayIndexOutOfBoundsException");

        int[] integerArray = {1, 2, 3};
        try {
            int maxElement = integerArray[3];
        } catch (ArrayIndexOutOfBoundsException exception) {
            log.error("this is an error",exception);
        }
    }
}
