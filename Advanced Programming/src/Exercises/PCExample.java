
public class PCExample {

    public static void main(String[] args) {
        Buffer b = new Buffer();
        ProducerRunnable p = new ProducerRunnable(b);
        ProducerRunnable p2 = new ProducerRunnable(b);
        ConsumerRunnable c = new ConsumerRunnable(b);
        Thread pt = new Thread(p);
        Thread pt2 = new Thread(p2);
        Thread ct = new Thread(c);
        pt.start();
        pt2.start();
        ct.start();

    }
}
