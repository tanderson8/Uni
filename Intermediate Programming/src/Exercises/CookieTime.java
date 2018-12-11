public class CookieTime
{
  public static void main(String[] args)
  {
    Cookies mint = new Cookies();
    Cookies chocolate = new Cookies(5);
    eatAllCookies(mint);
  System.out.println("Awwww no more mint cookies in a bowl");
  
  System.out.println();
  
  eatAllCookies(chocolate);
  System.out.println("Awww no more chocolate cookies in a bowl");
  }
  public static void eatAllCookies(Cookies flavor)
  {
    int numberOfCookiesLeft;
    do
    {
      System.out.println("I want cookies!");
      numberOfCookiesLeft = flavor.giveMeOneCookie();
      if(numberOfCookiesLeft != 0)
      {
        System.out.println("OM NOM NOM");
      }
    }
    while (numberOfCookiesLeft > 0);
  }
}
