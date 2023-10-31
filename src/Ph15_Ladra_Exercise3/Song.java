package Ph15_Ladra_Exercise3;
public class Song {
    private String songName, author;
    private int year;
    private static String genre = "pop";
    
    public Song(){
    songName = "Perfect";
    author = "Ed Sheeran";
    year = 2017;
    }
    public void Change() {
        songName = "Just Say you won't let go";
        author = "James Arthur";
        year = 2016;
    }
    public String getsongName(){
        return songName;
    }
    public String getauthor(){
        return author;
    }
    public int getyear(){
        return year;
    }
    public static String getgenre(){
        return genre;
    }
}