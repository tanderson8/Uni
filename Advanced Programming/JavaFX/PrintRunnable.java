package sample;

public class PrintRunnable implements Runnable {
    @Override
    public void run() {
        while(true) {
            System.out.println("hello world!");
        }
    }
}
