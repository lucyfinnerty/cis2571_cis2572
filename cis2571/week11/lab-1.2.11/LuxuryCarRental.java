// Name: Lucy Finnerty
// Date: 10/29/24
// Purpose: This class allows a LuxuryCarRental object to be made with a 5-arg constructor.
// It is a subclass and extention of the CarRental class. There is an accessor/ mutator method 
// for the one variable that makes CarRental and LuxuryCarRental differ.
public class LuxuryCarRental extends CarRental {
    
    private boolean chauffeur=false; // whether or not renter wants a chauffeur

    /**
     * 5-args LuxuryCarRental constructor
     * @param name renter's name
     * @param zipCode renter's zip code
     * @param size size of car
     * @param days amount of days car is rented
     * @param chauffeur whether or not renter wants a chauffeur
     */
    public LuxuryCarRental(String name, int zipCode, Size size, int days, boolean chauffeur) {
        super(name, zipCode, size, days); 
        super.setDailyRateBasedOnSize();
        super.setDailyRate(79.99);
        this.chauffeur = chauffeur;
        
        if(chauffeur) { // if true, add $200 to the current dailyRate
            super.setDailyRate(super.getDailyRate()+200);
        }
        setTotalFee(); // update totalFee
    }
    /**
     * accessor method for chauffeur variable
     * @return chauffeur
     */
    public boolean hasChauffeur() {
        return chauffeur;
    }
    /**
     * mutator method for chauffeur variable
     * @param chauffeur whether or not renter wants a chauffeur
     */
    public void setChauffeur(boolean chauffeur) {
        this.chauffeur = chauffeur;
        super.setDailyRate(super.getDailyRate() + 200); // update dailyrate
    }
    /**
     * method will display renter's information about their rental
     */
    @Override
    public String display() {
        String chauffeurInfo = chauffeur ? "Yes" : "No";
        return super.display() + String.format("\nChauffeur: %s", chauffeurInfo);
    }
}