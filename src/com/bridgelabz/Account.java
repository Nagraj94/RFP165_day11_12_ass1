package com.bridgelabz;
import java.util.ArrayList;
import java.util.Scanner;

public class Account {

    int balanceAmount = 100000;
    int withdraw;
    int currentBalance;
    static Scanner sc = new Scanner(System.in);
    ArrayList<Stock> list = new ArrayList<>();

    public int getBalanceAmount() {
        return balanceAmount;
    }

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
    public void totalStockValue() {
        int totalValue = 0;
        for (Stock stock : list) {
            int value = (stock.getNumShares() * stock.getSharePrice());
            System.out.println(value);
            //overall stock value
               totalValue = totalValue + value;
           }
        System.out.println("Current value of overall stock "+totalValue);
    }
    public void balanceAmount(){
        System.out.println("current balance "+balanceAmount);
            System.out.println("enter 1 to withdraw amount");
            System.out.println("enter any number key to exit ");
            int check = sc.nextInt();
            if(check == 1){
                System.out.println("enter amount to withdraw");
                withdraw = sc.nextInt();
                if (withdraw < balanceAmount){
                    int currentBalance = balanceAmount - withdraw;
                    this.currentBalance = currentBalance;
                    System.out.println("current balance is "+currentBalance+" amount debited with "+withdraw);
                    balanceAmount = balanceAmount - withdraw;
                }
                else{
                    System.out.println("entered amount is greater than account balance");
                }
            }

        }
    public static void main(String[] args) {
        Account account = new Account();
        StockAccount stockAccount = new StockAccount();
        while (true){
            System.out.println("************************************************");
            System.out.println("enter 1 to add stock ");
            System.out.println("enter 2 to check value of stock");
            System.out.println("enter 3 to check Portfolio ");
            System.out.println("enter 4 to check balance");
            System.out.println("enter 5 to buy shares");
            System.out.println("enter 6 to sell shares");
            System.out.println("************************************************");
            int check = sc.nextInt();
            if (check == 1){
                account.addStock();
            } else if (check == 2) {
                account.calStockValue();
            } else if (check == 3) {
                System.out.println(account.list);
                System.out.println(" ");
                account.totalStockValue();
            } else if (check == 4) {
                account.balanceAmount();
            } else if (check == 5) {
                stockAccount.buy();
            } else if (check == 7) {
               stockAccount.addStockToIns();
            } else if (check == 6) {
                stockAccount.sell();
            }
        }
    }
}
