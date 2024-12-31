
import java.util.concurrent.*;

public class Main {

    public static void main(String[] args) {
        // ExecutorService executorService = Executors.newFixedThreadPool(3);
//         Callable<Integer> callable1 = () -> {
//             System.out.println("Task 1");
//             Thread.sleep(1000);
//             return 1;
//         };
//         Callable<Integer> callable2 = () -> {
//             System.out.println("Task 2");
//             Thread.sleep(1000);
//             return 2;
//         };
//         Callable<Integer> callable3 = () -> {
//             System.out.println("Task 3");
//             Thread.sleep(1000);
//             return 3;
//         };

//         List<Callable<Integer>> callables = Arrays.asList(callable1, callable2, callable3);
//         try {
//             Integer i = executorService.invokeAny(callables);
//             System.out.println("Result: " + i);
//         } catch (InterruptedException | ExecutionException e) {
//             System.err.println("Error occurred: " + e.getMessage());
//         }
//         executorService.shutdown();
//         System.out.println("Hello World");
//     }
// }
//         List<Future<Integer>> futures = null;
//         try {
//             futures = executorService.invokeAll(List, 1000, TimeUnit.MILLISECONDS);
//         } catch (InterruptedException e) {
//             throw new RuntimeException(e);
//         }
//         for (Future<Integer> future : futures) {
//             try {
//                 System.out.println(future.get());
//             } catch (CancellationException | InterruptedException | ExecutionException e) {
//             }
//             executorService.shutdown();
//         }
//         System.out.println("Hello World");
//     }
// }
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        Future<Integer> future = executorService.submit(() -> {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                System.err.println("Thread was interrupted: " + e.getMessage());
            }
            System.out.println("Hello");
            return 42;

        });
//         Integer i = null;
//         try {
//             i = future.get(1000, TimeUnit.MILLISECONDS);
//         } catch (InterruptedException | ExecutionException | TimeoutException e) {
//             System.err.println("Error occurred: " + e.getMessage());
//         }
//         System.out.println(future.isDone());
//         System.out.println("Result: " + i);
//         executorService.shutdown();
//     }
// }

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.err.println("Thread was interrupted: " + e.getMessage());
        }
        future.cancel(false);
        System.out.println(future.isDone());
        System.out.println(future.isCancelled());
        executorService.shutdown();
    }
}
