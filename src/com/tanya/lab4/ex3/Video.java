package com.tanya.lab4.ex3;

class Video extends MediaItem {

    private String director;
    private String genre;
    private int yearReleased;

    public Video(int id, String title, int copies, int runtime,
                 String director, String genre, int yearReleased) {
        super(id, title, copies, runtime);
        this.director = director;
        this.genre = genre;
        this.yearReleased = yearReleased;
    }

    @Override
    public void print() {
        System.out.println("Video -> " + this.toString()
                + ", Director: " + director
                + ", Genre: " + genre
                + ", Year: " + yearReleased);
    }
}
