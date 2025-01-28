// Name: Lucy Finnerty
// Date: 10/29/24
// Purpose: This class allows for a CarRental object to be made with a 4-arg constructor.
// There are also accessor/mutator methods as well as a method to set daily rate based on size.
public class CarRental {
    
    private String name; // renter's name
    private int zipCode; // renter's zip code
    private Size size; // size of car
    private double dailyRate; // amount of money per day to rent car
    private int days; // amount of days car is rented
    private double totalFee; // total amount of money to rent car (dailyRate * days)
    enum Size{ECONOMY, MIDSIZE, FULL_SIZE} // enum that holds all sizes of cars to be rented

    /**
     * 4-args CarRental constructor
     * @param name renter's name
     * @param zipCode renter's zip code
     * @param size size of car
     * @param days amount of days car is rented
     */
    public CarRental(String name, int zipCode, Size size, int days) {
        this.name = name;
        this.zipCode = zipCode;
        this.size = size;
        this.days = days;
        setDailyRateBasedOnSize(); // daily rate set determined by size
        setTotalFee(); // total fee set determined by daily rate and days
    }
    /**
     * accessor method for name variable
     * @return name
     */
    public String getName() {
        return name;
    }
    /**
     * mutator method for name variable
     * @param name renter's name
     */
    public void setName(String name) {
        this.name = name;
    }
    /**
     * accessor method for zipCode variable
     * @return zipCode
     */
    public int getZipCode() {
        return zipCode;
    }
    /**
     * mutator method for zipCode variable
     * @param zipCode renter's zip code
     */
    public void setZipCode(int zipCode) {
        this.zipCode = zipCode;
    }
    /**
     * accessor method for size variable
     * @return size
     */
    public Size getSize() {
        return size;
    }
    /**
     * mutator method for size variable
     * @param size size of car
     */
    public void setSize(Size size) {
        this.size = size;
        setDailyRateBasedOnSize(); // update daily rate if size changes
        setTotalFee(); // update total fee
    }
    /**
     * accessor method for dailyRate variable
     * @return dailyRate
     */
    public double getDailyRate() {
        return dailyRate;
    }
    /**
     * mutator method for dailyRate variable
     * @param dailyRate amount of money per day to rent car
     */
    public void setDailyRate(double dailyRate) {
        this.dailyRate = dailyRate;
    }
    /**
     * accessor method for days variable
     * @return days
     */
    public int getDays() {
        return days;
    }
    /**
     * mutator method for days variable
     * @param days amount of days car is rented
     */
    public void setDays(int days) {
        this.days = days;
        setTotalFee(); // update total fee when days change
    }
    /**
     * accessor method for totalFee variable
     * @return totalFee
     */
    public double getTotalFee() {
        return totalFee;
    }
    /**
     * sets totalFee by multiplying dailyrate * days
     */
    public double setTotalFee(){
        return this.totalFee = dailyRate * days;
    }
    /**
     * sets daily rate based on Size enum assigned to size variable
     * @return dailyRate
     */
    public double setDailyRateBasedOnSize() {
        switch(size) {
            case Size.ECONOMY: // if size == Size.ECONOMY
                this.dailyRate = 29.99; // set dailyRate
                break;
            case Size.MIDSIZE: // if size == Size.MIDSIZE
                this.dailyRate = 38.99; // set dailyRate
                break;
            case Size.FULL_SIZE: // if size == Size.FULL_SIZE
                this.dailyRate = 43.50; // set dailyRate
                break;
        }
        return dailyRate;
    }
    /**
     * method will display renter's information about their rental
     */
    public String display() {
        return String.format("Renter: %s\nZip Code: %d\nCar Size: %s\nDaily Rate: $%.2f\nDays: %d\nTotal Fee: $%.2f",
        name, zipCode, size, dailyRate, days, totalFee);
    }
}