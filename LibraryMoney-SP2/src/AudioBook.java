public class AudioBook extends PhysicalBook implements IAudioBook{

    private int durationInMinutes;

    public AudioBook(String title, String literatureType, int copies, int durationInMinutes){
        super(title,literatureType,copies);
        this.durationInMinutes = durationInMinutes;

    }

    @Override
    protected double calculatePoints() {
        double literaturePoint = convertLiterature();
        double totalPoints = (durationInMinutes / 2.0) * literaturePoint * super.copies;
        return totalPoints;
    }


}
