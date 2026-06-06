package com.tanya.lab4.ex3;

abstract class Item {

    private int id;
    private String title;
    private int noOfCopies;

    public Item(int id, String title, int noOfCopies) {
        this.id = id;
        this.title = title;
        this.noOfCopies = noOfCopies;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public int getNoOfCopies() {
        return noOfCopies;
    }

    public void setNoOfCopies(int noOfCopies) {
        this.noOfCopies = noOfCopies;
    }

    public void checkIn() {
        noOfCopies++;
    }

    public void checkOut() {
        if (noOfCopies > 0) {
            noOfCopies--;
        } else {
            System.out.println("No copies available!");
        }
    }

    public void addItem(int count) {
        noOfCopies += count;
    }

    public boolean equals(Item obj) {
        return this.id == obj.id;
    }

    public abstract void print();

    @Override
    public String toString() {
        return "ID: " + id + ", Title: " + title + ", Copies: " + noOfCopies;
    }
}
