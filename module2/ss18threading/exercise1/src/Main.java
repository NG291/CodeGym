
public class Main {
    public static void main(String[] args) {
        NumberGenerator m1= new NumberGenerator();
        NumberGenerator m2= new NumberGenerator();

        Thread thread= new Thread(m1);
        Thread thread1= new Thread(m2);

        thread.setPriority(Thread.MAX_PRIORITY);
        thread1.setPriority(Thread.MIN_PRIORITY);

        thread.start();
        thread1.start();
    }
}
