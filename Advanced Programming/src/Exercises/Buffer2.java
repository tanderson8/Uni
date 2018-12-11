import java.util.Random;

public class Buffer2 {
    private final int SIZE = 8;
    private int nums[] = new int[SIZE];
    private int index = 0;
    private Random r = new Random();

    public synchronized void add(){

        while(index == SIZE-1){
            try{
                wait();
            }catch(InterruptedException e){}
        }
        nums[index++] = r.nextInt() % 100;
        System.out.println("Produced "+ nums[index] + " index "+ index);
    }

    public synchronized void remove(){
        while(index == 0){
            try{
                wait();
            }catch(InterruptedException e){}
        }

        System.out.println("Consumed " +  nums[index--] + " index " + index);
        notifyAll();

    }
}
