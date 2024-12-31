
import java.util.concurrent.CompletableFuture;

public class CF {

    public static void main(String[] args) {
        CompletableFuture<String> stringCompletablefuture = CompletableFuture.supplyAsync(() -> {
            try {
                Thread.sleep(5000);
                System.out.println("worker");
            } catch (InterruptedException e) {
                System.err.println("Error: " + e.getMessage());
            }
            return "ok";
        });

        stringCompletablefuture.thenAccept(result -> {
            System.out.println("Result: " + result);
        }).join();
    }
}
