public class CarRental {
    // do these have to be private???
    String name;
    int zipCode;
    String size;
    double dailyRate;
    int days;
    double totalFee;
    enum Size{ECONOMY, MIDSIZE, FULL_SIZE}

    public CarRental(String name, int zipCode, String size, int days) {
        this.name = name;
        this.zipCode = zipCode;
        this.size = size;
        this.days = days;
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

    public String getSize() {
        return size;
    }
    public void setSize(String size) {
        this.size = size;
    }

    public double getDailyRate() {
        return dailyRate;
    }
    public void setDailyRate(double dailyRate) {
        this.dailyRate = dailyRate;
    }
    public double dailyRateBasedOnSize() {
        switch(size) {
            case "ECONOMY":
                this.dailyRate = 29.99;
                break;
            case "MIDSIZE":
                this.dailyRate = 38.99;
                break;
            case "FULL_SIZE":
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
    }

    public double getTotalFee() {
        return totalFee;
    }
    public double setTotalFee(){
        return dailyRate * days;
    }
    //@Override
    public String display() {
        return "";
    }
}