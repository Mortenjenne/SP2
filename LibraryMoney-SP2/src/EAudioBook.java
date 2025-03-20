public class EAudioBook extends NetBook implements IAudioBook {

    private int durationInMinutes;

    public EAudioBook(String title, String literatureType, int availability, int reach, int use, int durationInMinutes) {
        super(title, literatureType, availability, reach, use);
        this.durationInMinutes = durationInMinutes;
    }

    @Override
    protected double calculatePoints() {
        return (this.durationInMinutes / 2.0) * super.convertLiterature() * super.getPseudoCopies();
    }

    @Override
    public void playAudio() {
        System.out.println("Playing e-audio book: " + super.getTitle());
    }

    @Override
    public void showAudioInfo() {
        System.out.println("E-Audio book: " + super.getTitle() + ", Duration: " + this.durationInMinutes + " minutes");
    }

}
