public class CountTester {

 

  public static void main(String[] args) {

 

    Count myCount = new Count();

 

    int times = 0;

 

 

 

    for (int i = 0; i < 100; i++)

 

      increment(myCount, times);

 

 

 

System.out.println("count is " +

 

  myCount.getCount());

 

    System.out.println("times is " + times);

 

  }

 

 

 

  public static void increment(Count c, int times) {

 

    c.inc();

 

    times++;

 

  }

 

}

 

 

class Count {

 

  private int count;

 

 

 

  Count(int c) {

 

    count = c;

 

  }

 

 

 

  Count() {

 

    count = 1;

 

  }

 

 

 

  public void inc() {

 

    count++;

 

  }

 

 

 

  public int getCount() {

 

return count;

 

  }

 

}

 