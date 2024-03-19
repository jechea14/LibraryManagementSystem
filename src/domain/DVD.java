package domain;

public class DVD {
    private String name;
    private String artist;
    private int year;

    public DVD(String name, String artist, int year) {
        this.name = name;
        this.artist = artist;
        this.year = year;
    }

    public String getName() {
        return this.name;
    }

    public String getArtist() {
        return this.artist;
    }

    public int getYear() {
        return this.year;
    }
}
