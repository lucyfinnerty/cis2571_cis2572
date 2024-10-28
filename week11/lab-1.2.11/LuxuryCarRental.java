public class LuxuryCarRental extends CarRental {
    boolean chauffeur=false;

    public LuxuryCarRental(String name, int zipCode, Size size, int days, boolean chauffeur) {
        super(name, zipCode, size, days);
        super.setDailyRateBasedOnSize();
        super.setDailyRate(79.99);
        this.chauffeur = chauffeur;
        
        if(chauffeur) {
            super.setDailyRate(super.getDailyRate()+200);
        }
        setTotalFee();
    }
    public boolean hasChauffeur() {
        return chauffeur;
    }
    public void setChauffeur(boolean chauffeur) {
        this.chauffeur = chauffeur;
        super.setDailyRate(super.getDailyRate() + 200);
    }
    @Override
    public String display() {
        String chauffeurInfo = chauffeur ? "Yes" : "No";
        return super.display() + String.format("\nChauffeur: %s", chauffeurInfo);
    }
}
