// Name:Joyce Martins
package hdip.oop2.code2;

public enum FarmerType {
    
    DAIRY(200),
    BEEF(150),
    SHEEP(160);
    
    private int theNumAcres;
    
    FarmerType(int aNumAcres){
        this.theNumAcres = aNumAcres;
    }
        
    public int getNumAcres() {
        return theNumAcres;
    }

    public void setNumAcres(int aNumAcres) {
        this.theNumAcres = aNumAcres;
    }

    @Override
    public String toString() {
        return this.name() + " farmer and has " + theNumAcres + " acres.";
    }
    


    
    
}

