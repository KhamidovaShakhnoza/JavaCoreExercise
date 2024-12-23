package BookOOP;

public class StockTest {
    public static void main(String[] args) {
        Stock stock1=new Stock("ORCL","Oracle Corporation");
        stock1.CurrentPrice=34.35;
        stock1.previousClosingPrice=34.5;
        System.out.println(stock1);
        System.out.println(stock1.getChangePercent());
    }
}
