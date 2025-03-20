public abstract class PhysicalBook extends Title {

    protected int copies;

    public PhysicalBook(String name, String literatureType, int copies) {
        super(name, literatureType);
        this.copies = copies;

    }

}

