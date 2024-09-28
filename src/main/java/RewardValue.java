public class RewardValue {
    private double cashValue;
    private double milesValue;

    // Constructor that accepts cash value
    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
        this.milesValue = cashToMiles(cashValue);
    }

    // Constructor that accepts miles value
    public RewardValue(double milesValue, boolean isMiles) {
        if (isMiles) {
            this.milesValue = milesValue;
            this.cashValue = milesToCash(milesValue);
        } else {
            this.cashValue = milesValue;
            this.milesValue = cashToMiles(cashValue);
        }
    }

    // Method to get cash value
    public double getCashValue() {
        return cashValue;
    }

    // Method to get miles value
    public double getMilesValue() {
        return milesValue;
    }

    // Helper method to convert cash to miles
    private double cashToMiles(double cash) {
        return cash / 0.0035;
    }

    // Helper method to convert miles to cash
    private double milesToCash(double miles) {
        return miles * 0.0035;
    }
}
