//represent financial assets that investors hold
package Ch9Inheritance.FinancialClasses;

public interface Asset {
    //how much the asset is worth
    double getMarketValue();
    //how much money has been made on this asset
    double getProfit();
}
