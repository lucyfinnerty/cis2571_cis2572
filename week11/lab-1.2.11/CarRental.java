public class CarRental {
    // do these have to be private???
    private String name;
    private int zipCode;
    private Size size;
    private double dailyRate;
    private int days;
    private double totalFee;
    enum Size{ECONOMY, MIDSIZE, FULL_SIZE}

    public CarRental(String name, int zipCode, Size size, int days) {
        this.name = name;
        this.zipCode = zipCode;
        this.size = size;
        this.days = days;
        setDailyRateBasedOnSize();
        setTotalFee();
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getZipCode() {
        return zipCode;
    }
    public void setZipCode(int zipCode) {
        this.zipCode = zipCode;
    }

    public Size getSize() {
        return size;
    }
    public void setSize(Size size) {
        this.size = size;
        setDailyRateBasedOnSize(); // Update daily rate if size changes
        setTotalFee(); // Update total fee
    }

    public double getDailyRate() {
        return dailyRate;
    }
    public void setDailyRate(double dailyRate) {
        this.dailyRate = dailyRate;
    }
    public double setDailyRateBasedOnSize() {
        switch(size) {
            case Size.ECONOMY:
                this.dailyRate = 29.99;
                break;
            case Size.MIDSIZE:
                this.dailyRate = 38.99;
                break;
            case Size.FULL_SIZE:
                this.dailyRate = 43.50;
                break;
        }
        return dailyRate;
    }

    public int getDays() {
        return days;
    }
    public void setDays(int days) {
        this.days = days;
        setTotalFee(); // Update total fee when days change
    }

    public double getTotalFee() {
        return totalFee;
    }
    public double setTotalFee(){
        return this.totalFee = dailyRate * days;
    }
    public String display() {
        return String.format("Renter: %s\nZip Code: %d\nCar Size: %s\nDaily Rate: $%.2f\nDays: %d\nTotal Fee: $%.2f",
        name, zipCode, size, dailyRate, days, totalFee);
    }
}