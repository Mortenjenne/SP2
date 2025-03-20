public class LibraryRoyalityCalculator {

    private static Author a1, a2, a3, a4, a5, a6, a7, a8;

    public static void main(String[] args) {

        addBooks();
        authorPayment();
    }

    public static void addBooks() {

        //Forfatter 1: Nikolaj Kirk
        a1 = new Author("Nikolaj Kirk");
        a1.addTitle(new PrintedBook("Mad over bål", "FAG", 150, 140));
        a1.addTitle(new AudioBook("Nak og æd", "FAG", 140, 58));

        //Forfatter 2: Olga Ravn
        a2 = new Author("Olga Ravn");
        a2.addTitle(new PrintedBook("Celestine", "SKØN", 140, 166));
        a2.addTitle(new AudioBook("Celestine", "SKØN", 140, 192));

        // Forfatter 3: J.R.R. Tolkien
        a3 = new Author("J.R.R. Tolkien");
        a3.addTitle(new PrintedBook("The Hobbit", "SKØN", 140, 456));
        a3.addTitle(new AudioBook("The Hobbit", "SKØN", 140, 786));
        a3.addTitle(new PrintedBook("The Lord of the Rings", "SKØN", 140, 575));
        a3.addTitle(new AudioBook("The Lord of the Rings", "SKØN", 140, 761));
        a3.addTitle(new PrintedBook("The Silmarillion", "SKØN", 140, 321));
        a3.addTitle(new AudioBook("The Silmarillion", "SKØN", 140, 789));

        // Forfatter 4: J.K. Rowling
        a4 = new Author("J.K. Rowling");
        a4.addTitle(new PrintedBook("Harry Potter and the Sorcerer's Stone", "BI", 100, 421));
        a4.addTitle(new AudioBook("Harry Potter and the Sorcerer's Stone", "BI", 100, 764));
        a4.addTitle(new PrintedBook("Harry Potter and the Chamber of Secrets", "BI", 100, 451));
        a4.addTitle(new AudioBook("Harry Potter and the Chamber of Secrets", "BI", 100, 781));
        a4.addTitle(new PrintedBook("Harry Potter and the Prisoner of Azkaban", "BI", 100, 625));
        a4.addTitle(new AudioBook("Harry Potter and the Prisoner of Azkaban", "BI", 100, 790));

        // Forfatter 5: Michelle Obama
        a5 = new Author("Michelle Obama");
        a5.addTitle(new PrintedBook("Becoming", "SKØN", 140, 324));
        a5.addTitle(new AudioBook("Becoming", "SKØN", 140, 290));
        a5.addTitle(new PrintedBook("The Light We Carry", "SKØN", 140, 421));
        a5.addTitle(new AudioBook("The Light We Carry", "SKØN", 140, 320));
        a5.addTitle(new PrintedBook("American Grown", "SKØN", 140, 412));
        a5.addTitle(new AudioBook("American Grown", "SKØN", 140, 335));

        // Forfatter 6: Hergé
        a6 = new Author("Hergé");
        a6.addTitle(new PrintedBook("The Adventures of Tintin: The Secret of the Unicorn", "TE", 140, 150));
        a6.addTitle(new AudioBook("The Adventures of Tintin: The Secret of the Unicorn", "TE", 140, 122));
        a6.addTitle(new PrintedBook("The Adventures of Tintin: Red Rackham's Treasure", "TE", 140, 223));
        a6.addTitle(new AudioBook("The Adventures of Tintin: Red Rackham's Treasure", "TE", 140, 113));

        a7 = new Author("Morten");
        //a7.addTitle(new EBook());
    }

    public static void authorPayment() {
        System.out.println(a1.getName() + " is receiving from the library: " + a1.calculateTotalPay() + "kr.");
        System.out.println(a2.getName() + " is receiving from the library: " + a2.calculateTotalPay() + "kr.");
        System.out.println(a3.getName() + " is receiving from the library: " + a3.calculateTotalPay() + "kr.");
        System.out.println(a4.getName() + " is receiving from the library: " + a4.calculateTotalPay() + "kr.");
        System.out.println(a5.getName() + " is receiving from the library: " + a5.calculateTotalPay() + "kr.");
        System.out.println(a6.getName() + " is receiving from the library: " + a6.calculateTotalPay() + "kr.");
        
    }


}
