package Ch9Inheritance.FinancialClasses;

public class MutualFund extends ShareAsset {
    private double totalShares;

    //constructs a new mutual fund investment with the given
    //symbol and price per share

    public MutualFund(String symbol, double currentPrice, double totalShares) {
        super(symbol, currentPrice);
        this.totalShares = totalShares;
    }
    public double getMarketValue(){
        return(totalShares*getCurrentPrice());
    }

    public double getTotalShares() {
        return totalShares;
    }
}
