
public class StockTester {

	public static void main(String[] args) {

		Stock stock1 = new Stock("NFW","National Federation of Wildlife");
		stock1.setCurrentPrice(34.35);
		stock1.setPreviousClosingPrice(34.5);

		System.out.println("Price change " + stock1.getChangePercent() + " % ");
	}

}
