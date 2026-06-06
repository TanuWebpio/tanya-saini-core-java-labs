package com.tanya.lab4.ex3;

class JournalPaper extends WrittenItem {

    private int yearPublished;

    public JournalPaper(int id, String title, int copies,
                        String author, int yearPublished) {
        super(id, title, copies, author);
        this.yearPublished = yearPublished;
    }

    public int getYearPublished() {
        return yearPublished;
    }

    @Override
    public void print() {
        System.out.println("Journal Paper -> " + this.toString()
                + ", Year Published: " + yearPublished);
    }
}
