    class Payment {
    private final String message;

    Payment(String message) {
        this.message = message;
    }

    String getReceipt() {
        return message;
    }
}
