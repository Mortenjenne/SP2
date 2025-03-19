public class AudioBook extends Title{

    private int durationInMinutes;

    public AudioBook(String title, String literatureType, int copies, int durationInMinutes){
        super(title,literatureType,copies);
        this.durationInMinutes = durationInMinutes;

    }

    @Override
    protected double calculatePoints() {
        double factor = convertLiterature();
        double totalPoints = (durationInMinutes / 2.0) * factor * super.copies;
        return totalPoints;
    }


}
