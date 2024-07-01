public class Main {
    public static void main(String[] args) {
        LazyPrimeFactorization lazyPrime = new LazyPrimeFactorization();
        OptimizedPrimeFactorization optimizedPrime = new OptimizedPrimeFactorization();

        Thread thread1 = new Thread(lazyPrime);
        Thread thread2 = new Thread(optimizedPrime);

        thread1.start();
        thread2.start();
    }
}