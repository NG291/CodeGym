import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

public class TaxiPool {
    private static final long EXPIRED_TIME_IN_MILLISECONDS = 1200;
    private static final int NUMBER_OF_TAXI = 4;
    private final List<Taxi> AVAILABLE = Collections.synchronizedList(new ArrayList<>());
    private final List<Taxi> INUSE = Collections.synchronizedList(new ArrayList<>());
    private final AtomicInteger count = new AtomicInteger(0);
    private final AtomicBoolean waiting = new AtomicBoolean(false);

    public synchronized void release(Taxi taxi) {
        INUSE.remove(taxi);
        AVAILABLE.add(taxi);
        System.out.println(taxi.getName() + " is free");
    }

    public synchronized Taxi getTaxi() {
        if (!AVAILABLE.isEmpty()) {
            Taxi taxi = AVAILABLE.remove(0); // Sử dụng remove để đảm bảo taxi không còn trong AVAILABLE
            INUSE.add(taxi);
            return taxi;
        }
        if (count.get() == NUMBER_OF_TAXI) {
            waitingUntilTaxiAvailable();
            return getTaxi();
        }
        Taxi taxi = createTaxi();
        INUSE.add(taxi);
        return taxi;
    }

    private Taxi createTaxi() {
        waiting(200);
        Taxi taxi = new Taxi("Taxi " + count.incrementAndGet());
        System.out.println(taxi.getName() + " is created");
        return taxi;
    }

    private void waitingUntilTaxiAvailable() {
        if (waiting.get()) {
            waiting.set(false);
            throw new TaxiNotFoundException("No taxi available");
        }
        waiting.set(true);
        waiting(EXPIRED_TIME_IN_MILLISECONDS);
    }

    private void waiting(long time) {
        try {
            TimeUnit.MICROSECONDS.sleep(time); // Sửa lại thành TimeUnit.MILLISECONDS
        } catch (InterruptedException e) {
            e.printStackTrace();
            Thread.currentThread().interrupt();
        }
    }
}
