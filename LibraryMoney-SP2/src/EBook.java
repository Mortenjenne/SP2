public class EBook extends NetBook{

    private int characters;
    private boolean illustrated;

    public EBook(String title, String literatureType, int availability, int reach, int characters, boolean illustrated){
        super(title,literatureType,availability,reach,characters);
        this.illustrated = illustrated;
        this.characters = characters;
    }

    private double calculatePages(){
        //Antal karakterer/1800 + 20
        double pages = (this.characters / 1800.0) + 20;
        if(illustrated){
            pages *= 1.10;
        }
        return pages;
    }
    @Override
    protected double calculatePoints() {
        double copies = super.getPseudoCopies();
        double pages = calculatePages();
        double literatureType = super.convertLiterature();

        double totalPoints = pages * literatureType * copies;

        return totalPoints;
    }
}
