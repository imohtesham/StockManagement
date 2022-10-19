

    public class StockManage {
    //a. Desc -> Write a program to read in Stock Names, Number of Share, Share Price.
        //Print a Stock Report with the total value of each Stock and the total value of
        //Stock.
        //b. I/P -> N number of Stocks, for Each Stock Read In the Share Name, Number of
        //Share, and Share Price
        //c. Logic -> Calculate the value of each stock and the total value
        //d. O/P -> Print the Stock Report.
        //e. Hint -> Create Stock and Stock Portfolio Class holding the list of Stocks read
        //from the input file. Have functions in the Class to calculate the value of each
        //stock and the value of total stocks.


        public static void main(String[] args) {


            // creating Object
            StockPortFolio stockPortfolio = new StockPortFolio();
            StockAccount stockAccount = new StockAccount();

            // Calling Method
            stockPortfolio.addStock("DMart", 2, 100);
            stockPortfolio.addStock("Reliance", 3, 150);
            stockPortfolio.calculateStockVal();
            stockPortfolio.printReport();

            stockAccount.debit();
            stockAccount.checkBalance();
        }
    }

