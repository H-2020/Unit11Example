package enumerations2;

public enum Coin {
    ONE_CENT(1),
    TWO_CENT(2),
    FIVE_CENT(5),
    TEN_CENT(10),
    TWENTY_CENT(20),
    FIFTY_CENT(50),
    ONE_EURO(100),
    TWO_EURO(200);

    private int cent;
    private Coin(int cent) {
        this.cent =cent;
    }

    public int getCent() {
        return this.cent;
    }


    //METHOD_OVERRIDE_FROM_OBJECT
    public String toString() {
        return name() +" "+ cent;
    }
}
