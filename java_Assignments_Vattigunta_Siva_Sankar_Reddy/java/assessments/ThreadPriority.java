package assessments;
class FactorialThread extends Thread {
    private int n;
    private Result result;

    public FactorialThread(int n, Result result) {
        this.n = n;
        this.result = result;
    }

    public void run() {
        long fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        result.setValue(fact);
    }
}

class AdditionThread extends Thread {
    private int a, b;
    private Result result;

    public AdditionThread(int a, int b, Result result) {
        this.a = a;
        this.b = b;
        this.result = result;
    }

    public void run() {
        result.setValue(a + b);
    }
}

class Result {
    private long value;
    private boolean available = false;

    public synchronized long getValue() {
        while (!available) {
            try {
                wait();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                return -1;
            }
        }
        available = false;
        notifyAll();
        return value;
    }

    public synchronized void setValue(long value) {
        while (available) {
            try {
                wait();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                return;
            }
        }
        this.value = value;
        available = true;
        notifyAll();
    }
}

public class ThreadPriority {
    public static void main(String[] args) throws InterruptedException {
        Result result1 = new Result();
        Result result2 = new Result();
        Result result3 = new Result();
        Result result4 = new Result();

        FactorialThread t1 = new FactorialThread(4, result1);
        FactorialThread t2 = new FactorialThread(6, result2);
        AdditionThread t3 = new AdditionThread(4, 5, result3);
        AdditionThread t4 = new AdditionThread(20, 10, result4);

        t2.setPriority(Thread.MAX_PRIORITY);
        t4.setPriority(Thread.MAX_PRIORITY - 1);
        t1.setPriority(Thread.NORM_PRIORITY);
        t3.setPriority(Thread.MIN_PRIORITY);

        t1.start();
        t2.start();
        t3.start();
        t4.start();

        t2.join();
        System.out.println("Factorial of 6: " + result2.getValue());
        t4.join();
        System.out.println("Addition of 20 and 10: " + result4.getValue());
        t1.join();
        System.out.println("Factorial of 4: " + result1.getValue());
        t3.join();
        System.out.println("Addition of 4 and 5: " + result3.getValue());
    }
}
