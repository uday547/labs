package com.deloitte.Lab04;

abstract class MediaItem extends Item{
	private int runtime;
	
	public MediaItem(int id, String title, int copies, int runtime) {
        super(id, title, copies);
        this.runtime = runtime;
    }

    public int getRuntime() {
        return runtime;
    }
    
    @Override
    public String toString() {
        return super.toString() + ", Runtime: " + runtime + " minutes";
    }

    @Override
    public void print() {
        System.out.println(toString());
    }
}

class Video extends MediaItem {
    private String director;
    private String genre;
    private int yearReleased;

    public Video(int id, String title, int copies, int runtime, String director, String genre, int year) {
        super(id, title, copies, runtime);
        this.director = director;
        this.genre = genre;
        this.yearReleased = year;
    }


public String getDirector() {
    return director;
}

public String getGenre() {
    return genre;
}

public int getYearReleased() {
    return yearReleased;
}

@Override
public String toString() {
    return super.toString() + ", Director: " + director + ", Genre: " + genre + ", Year Released: " + yearReleased;
}
}

class CD extends MediaItem {
    private String artist;
    private String genre;

    public CD(int id, String title, int copies, int runtime, String artist, String genre) {
        super(id, title, copies, runtime);
        this.artist = artist;
        this.genre = genre;
    }

    public String getArtist() {
        return artist;
    }

    public String getGenre() {
        return genre;
    }

    @Override
    public String toString() {
        return super.toString() + ", Artist: " + artist + ", Genre: " + genre;
    }
}

	


