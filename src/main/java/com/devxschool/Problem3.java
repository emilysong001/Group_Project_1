package com.devxschool;

public class Problem3 {
    static int appleCoin = 146;
    static int pearCoin = 5000;
    static int rubberCoin = 10000;
    /**
     * appleCoin is worth $1.78 and pearCoin is worth $0.3 while rubberCoin is worth $1
     * All of these coins are physical and can't be split into parts
     * Please create a variable for total amount of $ you can sell all your coins for and print it out to the console
     */
    public static void main(String[] args) {
        //TODO create variable for the total amount in $ that you have after selling all of your coins
        //TODO print this variable out to the console
        float appleCoinPrice = 1.78F;
        float pearCoinPrice = 0.3F;
        int rubberCoinPrice = 1;

        float totalAppleCoin = appleCoin*appleCoinPrice;
        float totalPearCoin = pearCoin*pearCoinPrice;
        int totalRubberCoin = rubberCoin*rubberCoinPrice;

      Float sum = totalAppleCoin+totalPearCoin+totalRubberCoin;
        System.out.println(sum);

    }
}
