public abstract class NetBook extends Title {

    private int availability; //Antal kommuner, der har bogen til udlån
    private int reach; //Antal kommuner, der har udlånt bogen
    private int use; //Antal udlån(anvenelsesfaktor)

    public NetBook(String title, String literatureType, int availability, int reach, int use) {
        super(title, literatureType);
        this.availability = availability;
        this.reach = reach;
        this.use = use;
    }

    //Beregner pseudo-kopi baseret på availability og reach/use
    protected double getPseudoCopies() {
        return (this.availability * 0.5) + getUseFactor();
    }

    private int getUseFactor() {
        return (this.reach * 5) + use;
    }

}
