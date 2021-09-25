package enumerations2;

import java.lang.reflect.Array;

public class CoinApp {

    public static void main(String[] args) {

        Coin[] coins = {Coin.ONE_CENT, Coin.TWO_CENT, Coin.FIVE_CENT, Coin.TEN_CENT,
                Coin.FIFTY_CENT, Coin.ONE_EURO, Coin.TWO_EURO, Coin.TWENTY_CENT};

        for (Coin c : Coin.values()) {
            System.out.println(c);
        }

        sumOfCent(coins);

    }

    public static void sumOfCent(Coin[] coins) {
        int sumCent = 0;
        for (Coin c : coins) {
            sumCent += c.getCent();
        }
        System.out.println("Total value: " + sumCent);
    }


}




