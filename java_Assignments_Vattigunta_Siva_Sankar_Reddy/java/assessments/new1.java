package assessments;

public class new1 extends Thread {

    public static void main(String[] args) throws InterruptedException {
        process1 t1 = new process1(4);
        process1 t2 = new process1(6);
        process2 t3 = new process2(4, 5);
        process2 t4 = new process2(20, 10);

      
        t2.start();
        t4.sleep(1);
        t4.start();
        t1.sleep(2);
        t1.start();
        t3.sleep(3);
        t3.start();
    }
}

class process1 extends Thread {
    int n;

    public process1(int n) {
        this.n = n;
    }

    @Override
    public void run() {
        int f = 1;
        int temp = n;
        while (temp > 0) {
            f *= temp;
            temp--;
        }
        System.out.println( f);
    }
}

class process2 extends Thread {
    int a, b;

    public process2(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public void run() {
        System.out.println((a + b));
    }
}
