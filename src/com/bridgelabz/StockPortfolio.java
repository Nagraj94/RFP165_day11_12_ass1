package com.bridgelabz;

final class StockIns {
    String stockName;
    int numShares;
    int sharePrice;
    public StockIns(String stockName, int numShares, int sharePrice) {
        this.stockName = stockName;
        this.numShares = numShares;
        this.sharePrice = sharePrice;
    }

    public String getStockName() {
        return stockName;
    }

    public void setStockName(String stockName) {
        this.stockName = stockName;
    }

    public int getNumShares() {
        return numShares;
    }

    public void setNumShares(int numShares) {
        this.numShares = numShares;
    }

    public int getSharePrice() {
        return sharePrice;
    }

    public void setSharePrice(int sharePrice) {
        this.sharePrice = sharePrice;
    }

    @Override
    public String toString() {
        return "StockPortfolio" + "stockName=" + stockName + ", numShares=" + numShares + " sharePrice=" + sharePrice ;
    }
}
