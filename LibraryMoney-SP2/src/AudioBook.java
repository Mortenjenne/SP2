public class AudioBook extends PhysicalBook implements IAudioBook{

    private int durationInMinutes;

    public AudioBook(String title, String literatureType, int copies, int durationInMinutes){
        super(title,literatureType,copies);
        this.durationInMinutes = durationInMinutes;
    }

    @Override
    protected double calculatePoints() {
        return (durationInMinutes / 2.0) * super.convertLiterature() * super.copies;
    }

    @Override
    public void playAudio() {
        System.out.println("Playing audio book: " + super.getTitle());
    }

    @Override
    public void showAudioInfo() {
        System.out.println("Audio book: " + super.getTitle() + ", Duration: " + this.durationInMinutes + " minutes");
    }
}
