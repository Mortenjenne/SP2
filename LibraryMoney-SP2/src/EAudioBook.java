public class EAudioBook extends NetBook implements IAudioBook{

    private int durationInMinutes;

    public EAudioBook(String title, String literatureType, int availability, int reach, int use, int durationInMinutes){
        super(title,literatureType, availability, reach, use);
        this.durationInMinutes = durationInMinutes;
    }

    @Override
    protected double calculatePoints() {
        double copies = super.getPseudoCopies();
        double literatureType = convertLiterature();

        double totalPoints = (this.durationInMinutes/2.0) * literatureType * copies;

        return totalPoints;
    }
}
