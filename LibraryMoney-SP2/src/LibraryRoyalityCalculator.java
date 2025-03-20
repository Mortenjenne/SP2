import java.util.ArrayList;

public class LibraryRoyalityCalculator {

    private static Author a1, a2, a3, a4, a5, a6, a7;
    private static ArrayList<Author> authors = new ArrayList<>();

    public static void main(String[] args) {

        addBooks(); //Tilføj bøger til bibloteket
        authorPayment(); //Udskriv betaling forfattere
    }


    public static void addBooks() {

        //Forfatter 1: Nikolaj Kirk
        a1 = new Author("Nikolaj Kirk");
        a1.addTitle(new PrintedBook("Mad over bål", "FAG", 150, 140));
        a1.addTitle(new AudioBook("Nak og æd", "FAG", 140, 58));
        authors.add(a1);

        //Forfatter 2: Olga Ravn
        a2 = new Author("Olga Ravn");
        a2.addTitle(new PrintedBook("Celestine", "SKØN", 140, 166));
        a2.addTitle(new AudioBook("Celestine", "SKØN", 140, 192));
        authors.add(a2);

        // Forfatter 3: J.R.R. Tolkien
        a3 = new Author("J.R.R. Tolkien");
        a3.addTitle(new PrintedBook("The Hobbit", "SKØN", 140, 456));
        a3.addTitle(new AudioBook("The Hobbit", "SKØN", 140, 786));
        a3.addTitle(new PrintedBook("The Lord of the Rings", "SKØN", 140, 575));
        a3.addTitle(new AudioBook("The Lord of the Rings", "SKØN", 140, 761));
        a3.addTitle(new PrintedBook("The Silmarillion", "SKØN", 140, 321));
        a3.addTitle(new AudioBook("The Silmarillion", "SKØN", 140, 789));
        authors.add(a3);

        // Forfatter 4: J.K. Rowling
        a4 = new Author("J.K. Rowling");
        a4.addTitle(new PrintedBook("Harry Potter and the Sorcerer's Stone", "BI", 100, 421));
        a4.addTitle(new AudioBook("Harry Potter and the Sorcerer's Stone", "BI", 100, 764));
        a4.addTitle(new PrintedBook("Harry Potter and the Chamber of Secrets", "BI", 100, 451));
        a4.addTitle(new AudioBook("Harry Potter and the Chamber of Secrets", "BI", 100, 781));
        a4.addTitle(new PrintedBook("Harry Potter and the Prisoner of Azkaban", "BI", 100, 625));
        a4.addTitle(new AudioBook("Harry Potter and the Prisoner of Azkaban", "BI", 100, 790));
        authors.add(a4);

        // Forfatter 5: Michelle Obama
        a5 = new Author("Michelle Obama");
        a5.addTitle(new PrintedBook("Becoming", "SKØN", 140, 324));
        a5.addTitle(new AudioBook("Becoming", "SKØN", 140, 290));
        a5.addTitle(new PrintedBook("The Light We Carry", "SKØN", 140, 421));
        a5.addTitle(new AudioBook("The Light We Carry", "SKØN", 140, 320));
        a5.addTitle(new PrintedBook("American Grown", "SKØN", 140, 412));
        a5.addTitle(new AudioBook("American Grown", "SKØN", 140, 335));
        authors.add(a5);

        // Forfatter 6: Hergé
        a6 = new Author("Hergé");
        a6.addTitle(new PrintedBook("The Adventures of Tintin: The Secret of the Unicorn", "TE", 140, 150));
        a6.addTitle(new AudioBook("The Adventures of Tintin: The Secret of the Unicorn", "TE", 140, 122));
        a6.addTitle(new PrintedBook("The Adventures of Tintin: Red Rackham's Treasure", "TE", 140, 223));
        a6.addTitle(new AudioBook("The Adventures of Tintin: Red Rackham's Treasure", "TE", 140, 113));
        authors.add(a6);

        //Forfatter 7: Morten
        a7 = new Author("Morten");
        a7.addTitle(new EBook("Cooking with Morten", "FAG", 97, 50, 205, 360000, false));
        a7.addTitle(new EAudioBook("Cooking with Morten", "FAG", 97, 50, 205, 320));
        authors.add(a7);
    }

    public static void authorPayment() {
        for (Author a : authors) {
            System.out.println(a);
        }

    }


}
