class Q 
{
    int n;
    boolean valueSet = false;

    synchronized int get() {
        if(!valueSet) {
            try {
                wait();
            } catch(InterruptedException e) {
                System.out.println("InterruptedException caught");
            }
        }
        System.out.println("Got: " + n);

        valueSet=false;
        notify();

        return n;
    }

    synchronized void put(int n) {
        System.out.println("Put method called");

        if(valueSet) {
            try {
                System.out.println("Put method if check called");
                wait();
            } catch(InterruptedException e) {
                System.out.println("InterruptedException caught");
            }

            
        }
        this.n=n;
        valueSet=true;

        System.out.println("Put: " + n);

        notify();
    }
}


class Producer implements Runnable {
    Q q;
    Producer(Q q) {
        this.q=q;
        new Thread(this,"Producer").start();
    }

    public void run() {
        int i=0;

        while(true) {
            q.put(i++);
        }
    }
}


class Consumer implements Runnable {
    Q q;

    Consumer(Q q) {
        this.q=q;
        new Thread(this,"Consumer").start();
    }

    public void run() {
        while(true) {
            q.get();
        }
    }
}

public class ProducerConsumer {
    public static void main(String[] args) {
        System.out.println("main thread started");
        Q obj = new Q();
        new Producer(obj);
        new Consumer(obj);
    }
}
