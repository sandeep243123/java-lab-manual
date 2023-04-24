public class MessageThread implements Runnable {
    private String message;
    private int interval;

    public MessageThread(String message, int interval) {
        this.message = message;
        this.interval = interval;
    }

    public void run() {
        while (true) {
            System.out.println(this.message);
            try {
                Thread.sleep(this.interval * 1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        Thread thread1 = new Thread(new MessageThread("Good Morning", 1));
        Thread thread2 = new Thread(new MessageThread("Hello", 2));
        Thread thread3 = new Thread(new MessageThread("Welcome", 3));

        thread1.start();
        thread2.start();
        thread3.start();
    }
}
