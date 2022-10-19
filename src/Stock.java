public class Stock {

    private String stockName;
    private int numOfShares;
    private int sharePrice;

    // constructor
    public Stock(String stockName, int numOfShares, int sharePrice) {
        super();
        this.stockName = stockName;
        this.numOfShares = numOfShares;
        this.sharePrice = sharePrice;
    }

    // Getters and Setters
    public String getStockName() {
        return stockName;
    }

    public int getNumOfShares() {
        return numOfShares;
    }

    public int getSharePrice() {
        return sharePrice;
    }

}