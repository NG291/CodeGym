import jdk.internal.org.objectweb.asm.tree.TryCatchBlockNode;

public class EvenThread implements Runnable {
    @Override
    public void run() {
        try {
            System.out.println(" My thread creating ");
            for (int i = 0; i <= 10; i += 2) {
                System.out.println("Thread:" + Thread.currentThread().getName() + " Numbers " + i);
                Thread.sleep(15);
            }
        } catch (InterruptedException e) {
            System.out.println("My thread Interrupted");
        }
        System.out.println("My thread run is over");
    }
}
