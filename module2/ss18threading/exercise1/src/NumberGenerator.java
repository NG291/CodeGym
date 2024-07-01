public class NumberGenerator implements Runnable {

    @Override
    public void run() {
        System.out.println("My thread running");
        try {
            for (int i = 1; i < 10; i++) {
                System.out.println("Thread: "+ Thread.currentThread().getName()+" Numbers:" + i +" Ma hashCode: "+ this.hashCode());
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            System.out.println("My thread Interrupted");
        }
        System.out.println("My thread run is over");
    }
}
