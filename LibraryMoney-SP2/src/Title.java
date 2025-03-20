public abstract class Title {
    private String title;
    protected final double rate;
    private String literatureType;


    public Title(String title, String literatureType) {
        this.title = title;
        this.rate = 0.067574;
        this.literatureType = literatureType.toUpperCase();
    }

    public double calculateRoyalty() {
        return calculatePoints() * rate;
    }

    protected abstract double calculatePoints();

    protected double convertLiterature() {
        switch (literatureType) {
            case "BI":
            case "TE":
                return 3.0;
            case "LYRIK":
                return 6.0;
            case "SKØN":
                return 1.7;
            case "FAG":
                return 1.0;
            default:
                System.out.println("Advarsel: Ukendt litteraturtype " + literatureType);
                return -1;
        }
    }
}


