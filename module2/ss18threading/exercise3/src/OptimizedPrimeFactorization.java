public class OptimizedPrimeFactorization implements Runnable {

    @Override
    public void run() {
        long number = 2;
        while (number<=100) {
            if (isPrime(number)) {
                System.out.println("OptimizedPrimeFactorization " + number);
            }
            number++;
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                System.out.println("My Threading Interrupted");

            }
        }

    }

    private boolean isPrime(long number) {
        if (number < 2) {
            return false;
        }
        for (long i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}


