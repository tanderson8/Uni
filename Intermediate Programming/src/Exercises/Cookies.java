public class Cookies
{
  private int cookiesInABowl;
  public Cookies(int numberOfCookies)
  {
    cookiesInABowl = numberOfCookies;
  }
  public Cookies()
  {
    cookiesInABowl = 10;
  }
  public int getCookiesInABowl()
  {
    return cookiesInABowl;
  }
  public void setCookiesInABowl(int cookiesInABowl)
  {
    if(cookiesInABowl < 0)
    {
      System.out.println("Negative cookies: NOT ALLOWED");
      return;
    }
    this.cookiesInABowl = cookiesInABowl;
  }
  public int giveMeOneCookie()
  {
    if(cookiesInABowl == 0)
    {
      System.out.println("NO MORE COOKIES!");
      return 0;
    }
    System.out.println(" Here is ONE Delicious Cookie for you.");
    cookiesInABowl--;
    System.out.println("---> " + cookiesInABowl + " left ");
    return 1;
  }
}