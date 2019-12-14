package pw.models;

public enum Currencies {
    USD(0.26),
    EUR(0.23),
    GPB(0.20),
    CHF(0.26),
    BTC(0.000037);
    double val;

    Currencies(double v) {
        this.val = v;
    }

    public double getVal() {
        return val;
    }
}
