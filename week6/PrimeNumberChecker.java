public class PrimeNumberChecker {
    private static class ThreadClass extends Thread {
        private int number;
        private boolean isPrime;

        public ThreadClass(int number) {
            this.number = number;
        }

        public void run() {
            this.isPrime = PrimeNumberChecker.isPrime(this.number);
        }

        public boolean isPrime() {
            return this.isPrime;
        }
    }

    private static class RunnableInterface implements Runnable {
        private int number;
        private boolean isPrime;

        public RunnableInterface(int number) {
            this.number = number;
        }

        public void run() {
            this.isPrime = PrimeNumberChecker.isPrime(this.number);
        }

        public boolean isPrime() {
            return this.isPrime;
        }
    }

    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) throws InterruptedException {
        int number = 23;

        // Using Thread class
        ThreadClass thread1 = new ThreadClass(number);
        thread1.start();

        // Using Runnable interface
        RunnableInterface runnable = new RunnableInterface(number);
        Thread thread2 = new Thread(runnable);
        thread2.start();

        // Wait for both threads to finish
        thread1.join();
        thread2.join();

        // Retrieve results
        boolean isPrime1 = thread1.isPrime();
        boolean isPrime2 = runnable.isPrime();

        // Print results
        System.out.println(number + " is " + (isPrime1 ? "" : "not ") + "prime (using Thread class)");
        System.out.println(number + " is " + (isPrime2 ? "" : "not ") + "prime (using Runnable interface)");
    }
}

