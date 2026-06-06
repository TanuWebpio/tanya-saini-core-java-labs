package com.tanya.lab4.ex3;

public class LibraryMain {

    public static void main(String[] args) {

        Book book = new Book(101, "Java Basics", 5, "James Gosling");
        JournalPaper jp = new JournalPaper(102, "AI Research", 3, "John Doe", 2023);

        Video video = new Video(201, "Inception", 4, 150,
                "Christopher Nolan", "Sci-Fi", 2010);

        CD cd = new CD(301, "Best Hits", 10, 60,
                "A.R. Rahman", "Music");

        System.out.println("----- LIBRARY ITEMS -----\n");

        book.print();
        jp.print();
        video.print();
        cd.print();

        System.out.println("\n----- OPERATIONS -----");

        book.checkOut();
        book.checkIn();
        book.addItem(2);

        System.out.println("\nAfter operations:");
        book.print();
    }
}
