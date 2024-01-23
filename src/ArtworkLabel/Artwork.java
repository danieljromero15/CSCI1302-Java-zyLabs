package ArtworkLabel;

public class Artwork {

    // TODO: Declare private fields - title, yearCreated
    private String title;
    private int yearCreated;

    // TODO: Declare private field artist of type Artist
    private Artist artist;

    // TODO: Define default constructor
    public Artwork(){
        this("unknown", -1, new Artist());
    }

    // TODO: Define get methods: getTitle(), getYearCreated()
    public String getTitle(){
        return title;
    }
    public int getYearCreated(){
        return yearCreated;
    }

    // TODO: Define second constructor to initialize
    //       private fields (title, yearCreated, artist)
    public Artwork(String userTitle, int yearCreated, Artist userArtist) {
        title = userTitle;
        this.yearCreated = yearCreated;
        artist = userArtist;
    }

    // TODO: Define printInfo() method
    //       Call the printInfo() method in Artist.java to print an artist's information
    public void printInfo(){
        artist.printInfo();
        System.out.println("\nTitle: " + title + ", " + yearCreated);
    }

}

