package BookOOP;

public class Stock {
    String symbol;
    String name;
    double previousClosingPrice;
    double CurrentPrice;
    Stock(String symbol, String name){
        this.symbol=symbol;
        this.name=name;
    }

    public double getChangePercent() {
        return (CurrentPrice-previousClosingPrice)*100/previousClosingPrice;
    }

    @Override
    public String toString() {
        return "Stock{" +
                "symbol='" + symbol + '\'' +
                ", name='" + name + '\'' +
                ", previousClosingPrice=" + previousClosingPrice +
                ", CurrentPrice=" + CurrentPrice +
                '}';
    }
}

