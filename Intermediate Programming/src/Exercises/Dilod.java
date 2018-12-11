public class Dilod {

  public static void main(String[] args) {

    Object[] o = {new Ramone(), new B()};

    System.out.print(o[0]);

    System.out.print(o[1]);  

  }

}

 

class Ramone extends B {

  public String toString() {

    return "A";

  }

}

 

class Yess {

  public String toString() {

    return "B";

  } 

}

 