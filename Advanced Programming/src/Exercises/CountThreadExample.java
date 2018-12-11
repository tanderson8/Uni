public class CountThreadExample {

    public static void main(String[] args) {

        Thread t1 = new Thread( () -> {
          while(true) {
              try {
                  Thread.sleep(1000);
              } catch(InterruptedException e) {

              }
              System.out.println("hello world!");
          }
        });

        Thread t2 = new Thread( () -> {
            while(true) {
                try {
                    Thread.sleep(1000);
                } catch(InterruptedException e) {

                }
                System.out.println("good bye!");
            }
        });
        t1.start();
        t2.start();
    }
}
