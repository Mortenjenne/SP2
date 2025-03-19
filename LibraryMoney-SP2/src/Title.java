public abstract class Title {
    private String title;
    private double literatureTypePoints; //Ændret fra int til double så den kan returne i convert
    protected int copies;
    protected double rate;
    private String literatureType;


    public Title(String title, String literatureType, int copies) {
        this.title = title;
        this.copies = copies;
        this.rate = 0.067574;
        this.literatureType = literatureType;

        switch (literatureType) {
            case "BI":
                this.literatureTypePoints = 3.0;
                break;
            case "TE":
                this.literatureTypePoints = 3.0;
                break;
            case "LYRIK":
                this.literatureTypePoints = 6.0;
                break;
            case "SKØN":
                this.literatureTypePoints = 1.7;
                break;
            case "FAG":
                this.literatureTypePoints = 1.0;
                break;
            default:
                System.out.println("Advarsel: Ukendt litteraturtype " + literatureType);
                this.literatureTypePoints = -1;
                break;
        }

    }

    public double calculateRoyalty() {
        return calculatePoints() * rate;
    }

    protected abstract double calculatePoints();

    protected double convertLiterature() {
        return literatureTypePoints;
    }
}


