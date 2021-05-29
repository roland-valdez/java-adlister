import java.io.Serializable;

public class Album implements Serializable {
    private int id;
    private String artist;
    private String name;
    private int releaseDate;
    private double sales;
    private String genre;

    public Album(){};

    public void setId(int id){
        this.id = id;
    }
    public int getId(){
        return this.id;
    }
    public void setArtist(String artist){
        this.artist = artist;
    }
    public String getArtist(){
        return this.artist;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
    public void setReleaseDate(int releaseDate){
        this.releaseDate = releaseDate;
    }
    public int getReleaseDate(){
        return this.releaseDate;
    }
    public void setSales(double sales){
        this.sales = sales;
    }
    public double getSales(){
        return this.sales;
    }
    public void setGenre(String genre){
        this.genre = genre;
    }
    public String getGenre(){
        return this.genre;
    }


}
