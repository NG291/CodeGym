public class LazyPrimeFactorization implements Runnable {

    @Override
    public void run() {
        long number = 2;
        while (number<=100) {
            if (isPrime(number)) {
                System.out.println("LazyPrimeFactorixzation " + number);
            }
            number++;
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                System.out.println("My Threading Interrupted");

            }
        }

    }

    private Boolean isPrime(long number) {
        if (number < 2) {
            return false;
        }
        if (number == 2) {
            return true;
        }
        for (int i = 3; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
