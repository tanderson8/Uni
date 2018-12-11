public class TipCalculator {

    private double amount;
    private double tipPercent;
    private double taxPercent;

    public TipCalculator(double amount, double tipPercent, taxPercent){
        this.amount = amount;
        this.tipPercent = tipPercent;
        this.taxPercent = taxPercent;
    }


    public void readFile() throws exception{
    File file = new File (pathname: "res/poem.txt");
    Scanner scanner = new Scanner(file);
    while (scanner.hasNextLine());
    System.out.println(scanner.nextLine());
        }
        scanner.close;
        }

        public static void calculateBill(){
    scanner keyboard = new Scanner(System.in);
    System.out.println("Please enter amount: ");
    String amount = keyboard.next();
    double total = double parseDouble(amount);
    double bill = total + total*0.06 * total * 0.2;
    System.out.println("Your total bill is " + bill);
        }