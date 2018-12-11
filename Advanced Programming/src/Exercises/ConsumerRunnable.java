public class ConsumerRunnable implements Runnable {

    private Buffer b;

    public ConsumerRunnable(Buffer b) {
        this.b = b;
    }

    @Override
    public void run() {
        while(true) {
            try {
                Thread.sleep(500);
            } catch(InterruptedException e) {}
            b.remove();
        }
    }
}
