public class CommandLineMessage {
  public static void main(String [] args)
{
  if(args.length == 0 || args [0].equals("H"))
    System.out.print("Hello");
    //“Hello world is a good example to start to code!”
  else if(args [0].equals("G"))
    System.out.print("Goodbye.");
  //“Goodbye. my world!”
  for(int i = 1; i < args.length; i++)
    System.out.print(" " + args[i]);
  System.out.println("!");
}
  }
