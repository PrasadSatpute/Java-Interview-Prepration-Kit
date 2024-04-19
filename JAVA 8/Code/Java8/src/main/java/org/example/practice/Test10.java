package org.example.practice;
import java.util.concurrent.CompletableFuture;
//Implement a CompletableFuture
// to perform an asynchronous task and handle its result using thenApply().
public class Test10 {
    public static void main(String[] args) {
        // Create a CompletableFuture representing an asynchronous task
        CompletableFuture<String> future = CompletableFuture.supplyAsync(() -> {
            // Simulating some time-consuming task
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return "Task completed";
        });

        // Handle the result of the asynchronous task
        CompletableFuture<Integer> resultFuture = future.thenApply(result -> {
            System.out.println("Received result: " + result);
            // Manipulate the result (in this case, getting its length)
            return result.length();
        });

        // Wait for the future to complete and print the result
        resultFuture.thenAccept(length -> {
            System.out.println("Length of the result: " + length);
        });

        // Wait for the CompletableFuture to complete
        try {
            Thread.sleep(3000); // Adding some delay to see the result
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
