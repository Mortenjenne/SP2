import java.util.ArrayList;

public class Author {
    private String name;
    private ArrayList<Title> titles;

    public Author(String name) {
        this.name = name;
        this.titles = new ArrayList<>();
    }

    public void addTitle(Title title) {
        titles.add(title);
    }

    public float calculateTotalPay() {
        float totalAmount = 0;
        for (Title t : titles) {
            totalAmount += t.calculateRoyalty();
        }
        float roundedAmount = Math.round(totalAmount * 100f) / 100.0f;
        return roundedAmount;
    }

    public String getName() {
        return this.name;
    }

    public String toString() {
        return this.name + " will receive royalties from the library: " + this.calculateTotalPay() + "kr.";
    }

    public void playAudioBooks() {
        for (Title title : titles) {
            if (title instanceof IAudioBook) {
                IAudioBook audioBook = (IAudioBook) title;
                audioBook.playAudio();
            }
        }

    }
}
