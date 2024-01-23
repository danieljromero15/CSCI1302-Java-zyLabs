package ArtworkLabel;

public class Artist {

    // TODO: Declare private fields - artistName, birthYear, deathYear
    private String artistName;

    private int birthYear;
    private int deathYear;

    // TODO: Define default constructor
    public Artist(){
        this("unknown", -1, -1);
    }

    // TODO: Define second constructor to initialize
    //       private fields (artistName, birthYear, deathYear)
    public Artist(String userArtistName, int userBirthYear, int userDeathYear) {
        artistName = userArtistName;
        birthYear = userBirthYear;
        deathYear = userDeathYear;
    }

    // TODO: Define get methods: getName(), getBirthYear(), getDeathYear()
    public String getName(){
        return artistName;
    }

    public int getBirthYear(){
        return birthYear;
    }

    public int getDeathYear(){
        return deathYear;
    }

    // TODO: Define printInfo() method
    //       If deathYear is entered as -1, only print birthYear
    public void printInfo(){
        System.out.print("Artist: " + artistName + " ");
        if(birthYear >= 0){
            if(deathYear >= 0){
                System.out.print("(" + birthYear + " to " + deathYear + ")"); // both are nonnegative
            }else{
                System.out.print("(" + birthYear + " to present)"); // birth is positive, death is negative
            }
        }else{
            System.out.print("(unknown)"); // otherwise
        }
    }

}