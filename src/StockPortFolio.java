import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StockPortFolio {

    private List<Stock> stocks;
    private Map<String, Double> stockMap;
    private double totalStockVal;

    // constructor
    public StockPortFolio() {
        stocks = new ArrayList<>();
        stockMap = new HashMap<>();
    }

    // Instance Method To calculate StockVal
    public void calculateStockVal() {
        for (Stock stock : stocks) {
            double stockVal = calculateValueForStock(stock);
            totalStockVal += stockVal;
            stockMap.put(stock.getStockName(), stockVal);
        }
    }

    // Instance Method To calculate Value For Stock parameter stock
    private double calculateValueForStock(Stock stock) {
        double result = stock.getNumOfShares() * stock.getSharePrice();
        return result;

    }

    // Instance Method To add Stock by using parameter
    public void addStock(String stockName, int numOfShares, int sharePrice) {
        stocks.add(new Stock(stockName, numOfShares, sharePrice));
    }

    // print Report Method
    public void printReport() {
        for (Map.Entry<String, Double> entry : stockMap.entrySet()) {
            System.out.println("The Company : " + entry.getKey() + " Stock Value : " + entry.getValue());

        }
        System.out.println("Total Stock Value is: " + totalStockVal);
    }
}