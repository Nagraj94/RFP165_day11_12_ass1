package com.bridgelabz;

import java.util.ArrayList;
import java.util.Scanner;

public class Account {

    public static final int balanceAmount = 100000;
    static Scanner sc = new Scanner(System.in);

    ArrayList<Stock> list = new ArrayList<>();

    public void addStock(){
        System.out.println("enter stock name");
        String stockName = sc.next();
        System.out.println("enter number of share");
        int numShare = sc.nextInt();
        System.out.println("enter share price");
        int sharePrice = sc.nextInt();

        Stock stock = new Stock(stockName,numShare,sharePrice);
        list.add(stock);
    }
    public void calStockValue(){
        System.out.println("Enter stock name ");
        String sName = sc.next();
        for (Stock stock : list) {
            if (stock.getStockName().equals(sName)){
                int value = stock.getNumShares()*stock.getSharePrice();
                System.out.println(stock.getStockName()+" number of shares: "+stock.getNumShares()
                        +" current price: "+stock.getSharePrice()+" total value: "+value);
                break;
            }
            else {
                System.out.println(stock.getStockName()+" is not available in your list");
            }
        }
    }

    public  void  totalStockValue(){
        int numOfStock = list.size();
        for (Stock stock : list) {
            int sum =0;
            for (int i = stock.getNumShares(); i < numOfStock; i++) {
                sum += stock.getSharePrice();
                System.out.println(sum);
            }
        }
    }
    public static void main(String[] args) {
        Account account = new Account();
        while (true){
            System.out.println("************************************************");
            System.out.println("enter 1 to add stock ");
            System.out.println("enter 2 to check value of stock");
            System.out.println("enter 3 to check overall value of stock");
            System.out.println("************************************************");
            int check = sc.nextInt();
            if (check == 1){
                account.addStock();
            } else if (check == 2) {
                account.calStockValue();
            } else if (check == 3) {
                System.out.println(account.list);
                account.totalStockValue();

            }
        }
    }
}
