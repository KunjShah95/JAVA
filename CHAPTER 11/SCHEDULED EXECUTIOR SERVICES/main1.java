
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

public class main1 {

    public static void main(String[] args) {
        ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);
        scheduler.shutdown();
        Executors.newFixedThreadPool(2).shutdown();
        Executors.newSingleThreadExecutor().shutdown();
    }
}
