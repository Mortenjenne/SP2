public class LibraryRoyalityCalculator {
    public static void main(String[] args) {

        addBooks();
        authorPayment();


    }

    public static void addBooks() {
        //Forfatter 1: Nikolaj Kirk
        Author a1 = new Author("Nikolaj Kirk");
        a1.addTitle(new PrintedBook("Mad over bål", "BI", 150, 140));
        a1.addTitle(new AudioBook("Nak og æd", "FAG", 140, 58));

        //Forfatter 2: Olga Ravn
        Author a2 = new Author("Olga Ravn");
        a2.addTitle(new PrintedBook("Celestine", "SKØN", 140, 166));
        a2.addTitle(new AudioBook("Celestine", "SKØN", 140, 192));

        // Forfatter 3: J.R.R. Tolkien
        Author a3 = new Author("J.R.R. Tolkien");
        a3.addTitle(new PrintedBook("The Hobbit", "SKØN", 310, 456));
        a3.addTitle(new AudioBook("The Hobbit", "SKØN", 600, 786));
        a3.addTitle(new PrintedBook("The Lord of the Rings", "SKØN", 1216, 575));
        a3.addTitle(new AudioBook("The Lord of the Rings", "SKØN", 1600, 761));
        a3.addTitle(new PrintedBook("The Silmarillion", "SKØN", 366, 321));
        a3.addTitle(new AudioBook("The Silmarillion", "SKØN", 600, 789));

        // Forfatter 4: J.K. Rowling
        Author a4 = new Author("J.K. Rowling");
        a4.addTitle(new PrintedBook("Harry Potter and the Sorcerer's Stone", "BI", 309, 421));
        a4.addTitle(new AudioBook("Harry Potter and the Sorcerer's Stone", "BI", 720, 764));
        a4.addTitle(new PrintedBook("Harry Potter and the Chamber of Secrets", "BI", 341, 451));
        a4.addTitle(new AudioBook("Harry Potter and the Chamber of Secrets", "BI", 780, 781));
        a4.addTitle(new PrintedBook("Harry Potter and the Prisoner of Azkaban", "BI", 435, 625));
        a4.addTitle(new AudioBook("Harry Potter and the Prisoner of Azkaban", "BI", 900, 790));

        // Forfatter 5: Michelle Obama
        Author a5 = new Author("Michelle Obama");
        a5.addTitle(new PrintedBook("Becoming", "SKØN", 426, 324));
        a5.addTitle(new AudioBook("Becoming", "SKØN", 1140, 290));
        a5.addTitle(new PrintedBook("The Light We Carry", "SKØN", 368, 421));
        a5.addTitle(new AudioBook("The Light We Carry", "SKØN", 800, 320));
        a5.addTitle(new PrintedBook("American Grown", "SKØN", 300, 412));
        a5.addTitle(new AudioBook("American Grown", "SKØN", 450, 335));

        // Forfatter 6: Hergé (Tintin)
        Author a6 = new Author("Hergé");
        a6.addTitle(new PrintedBook("The Adventures of Tintin: The Secret of the Unicorn", "TE", 200, 150));
        a6.addTitle(new AudioBook("The Adventures of Tintin: The Secret of the Unicorn", "TE", 600, 122));
        a6.addTitle(new PrintedBook("The Adventures of Tintin: Red Rackham's Treasure", "TE", 220, 223));
        a6.addTitle(new AudioBook("The Adventures of Tintin: Red Rackham's Treasure", "TE", 650, 113));



    }

    public static void authorPayment() {
        System.out.println(a2.getName() + " is receiving from the library: " + a2.calculateTotalPay() + "kr.");

    }


}
