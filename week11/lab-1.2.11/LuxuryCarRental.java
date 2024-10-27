public class LuxuryCarRental extends CarRental {
    boolean chauffeur=false;

    public LuxuryCarRental(String name, int zipCode, String size, int days, boolean chauffeur) {
        super(name, zipCode, size, days);
        super.setDailyRate(79.99);
        this.chauffeur = chauffeur;
        if(chauffeur) {
            super.dailyRate += 200;
        }
    }
    public boolean getChauffeur() {
        return chauffeur;
    }
    public void setChauffeur(boolean chauffeur) {
        this.chauffeur = chauffeur;
    }
}
