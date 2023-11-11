package java8.CompletableFutureAPI;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/**
 * CompletableFuture in Java is a class introduced in Java 8, residing in the java.util.concurrent package.
 * It represents a future result of an asynchronous computation—a concept that allows you to write non-blocking
 * code by running a task on a separate thread and then carrying on with other tasks until the result is ready.
 * CompletableFuture provides methods for manually completing the computation, combining several futures together,
 * and applying functions or actions upon the result. It enhances the capabilities of Future with additional completion
 * logic and method chaining, making it easier to manage a sequence of asynchronous tasks and their dependencies.
 */
public class CompletableFutureExample {

    public static void main(String[] args) {

        // Run a task specified by a Runnable Object asynchronously.
        CompletableFuture<Void> future1 = CompletableFuture.runAsync(() -> {
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                throw new IllegalStateException(e);
            }
            System.out.println("Task from runAsync is Completed!");
        });

        // Asynchronously return a value.
        CompletableFuture<String> future2 = CompletableFuture.supplyAsync(() -> {
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                throw new IllegalStateException(e);
            }
            return "Result of the asynchronous computation";
        });

        // Block and wait for the future to complete
        try {
            System.out.println("future1 is done: " + future1.isDone());
            System.out.println("future2 is done: " + future2.isDone());

            // Let’s delay the retrieval of the computation result:
            System.out.println("Result of Future2: " + future2.get(2, TimeUnit.SECONDS));
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            e.printStackTrace();
        }

        System.out.println("future1 is done: " + future1.isDone());
        System.out.println("future2 is done: " + future2.isDone());
    }
}
