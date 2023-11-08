package java8.CompletableFutureAPI;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

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
