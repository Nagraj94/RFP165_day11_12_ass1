package com.bridgelabz;

import java.util.ArrayList;

public class StockAccount extends Account{
   final ArrayList<StockIns> insList = new ArrayList<>();

    void addStockToIns(){
        System.out.println("enter stock name");
        String stockName = sc.next();
        System.out.println("enter number of share");
        int numShare = sc.nextInt();
        System.out.println("enter share price");
        int sharePrice = sc.nextInt();

        StockIns insStock = new StockIns(stockName,numShare,sharePrice);
        insList.add(insStock);
    }
    void buy() {
        System.out.println("enter stock name ");
        String sName = sc.next();
        System.out.println("enter number of shares to buy");
        int numShares = sc.nextInt();
        System.out.println("enter price at what value to buy");
        int sharePrice = sc.nextInt();
        for (StockIns stockIns : insList) {
            if (stockIns.equals(sName)){
                int value = 0;
                value = numShares * sharePrice;
                System.out.println(" total amount to buy number of share " + numShares + " at share price " + sharePrice + " is " + value);
                for (Stock stock : list){
                    int add = numShares + stock.getNumShares();
                    if(value<balanceAmount){
                        System.out.println("press Y to confirm");
                        String a = sc.next();
                        if (a == "Y"){
                            System.out.println("total number of shares in your account is "+add);
                        }
                    }
                    else {
                        System.out.println("you don't enough amount to buy number of shares");
                    }

                }
            }

        }
    }
        void sell(){
            System.out.println("enter stock name ");
            String sName = sc.next();
            System.out.println("enter number of shares to buy");
            int numShares = sc.nextInt();
            System.out.println("enter price at what value to sell");
            int sharePrice = sc.nextInt();
            for (StockIns stockIns : insList) {
                if (stockIns.equals(sName)){
                    int value = 0;
                    value = numShares * sharePrice;
                    System.out.println(" total amount to sell number of share " + numShares + " at share price " + sharePrice + " is " + value);
                    for (Stock stock : list){
                        int add = numShares - stock.getNumShares();
                        if(value<balanceAmount){
                            System.out.println("press Y to confirm");
                            String a = sc.next();
                            if (a == "Y"){
                                System.out.println("total number of shares in your account is "+add);
                            }
                        }
                        else {
                            System.out.println("you don't enough amount to sell number of shares");
                        }

                    }
                }

            }
        }
    }
