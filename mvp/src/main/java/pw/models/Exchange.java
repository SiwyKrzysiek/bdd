package pw.models;

public class Exchange {
    public static double exchange(double wantToChange, String currency) {
        double money = 0;
        switch (currency) {
            case "USD":
                money = wantToChange * Currencies.USD.getVal();
                break;

            case "EUR":
                money = wantToChange * Currencies.EUR.getVal();
                break;

            case "GPB":
                money = wantToChange * Currencies.GPB.getVal();
                break;

            case "CHF":
                money = wantToChange * Currencies.CHF.getVal();
                break;

            case "BTC":
                money = wantToChange * Currencies.BTC.getVal();
                break;
        }
        return money;
    }
}
