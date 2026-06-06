package com.tanya.lab4.ex3;

class CD extends MediaItem {

    private String artist;
    private String genre;

    public CD(int id, String title, int copies, int runtime,
              String artist, String genre) {
        super(id, title, copies, runtime);
        this.artist = artist;
        this.genre = genre;
    }

    @Override
    public void print() {
        System.out.println("CD -> " + this.toString()
                + ", Artist: " + artist
                + ", Genre: " + genre);
    }
}
