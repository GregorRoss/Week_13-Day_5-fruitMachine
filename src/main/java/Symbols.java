public enum Symbols {

    CHERRY(2),
    BAR(8),
    BELL(4),
    LEMON(3),
    Pound(10);

    private final int value;

    Symbols(int value) {
        this.value = value;
    }

    public int getValue() {
        return this.value;
    }
}
