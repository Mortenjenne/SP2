public class PrintedBook extends PhysicalBook{

    private int pages;

    public PrintedBook(String title, String literatureType, int copies, int pages){
        super(title,literatureType,copies);
        this.pages = pages;

    }
    @Override
    protected double calculatePoints() {
        double literaturePoint = convertLiterature();
        double totalPoints = this.pages * literaturePoint * super.copies;
        return totalPoints;
    }
}
