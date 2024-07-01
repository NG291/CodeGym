public class OddThread implements Runnable {
    public void run() {
        try {
            System.out.println(" My thread creating ");
            for (int i = 1; i < 10; i += 2) {
                System.out.println("Thread:" + Thread.currentThread().getName() + " Numbers " + i);
                Thread.sleep(10);
            }
        } catch (InterruptedException e) {
            System.out.println("My thread Interrupted");
        }
        System.out.println("My thread run is over");
    }
}
