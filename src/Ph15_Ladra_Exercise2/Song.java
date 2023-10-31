package Ph15_Ladra_Exercise2;
public class Song {
    String songName;
    String author;
    int year;
    String genre;
    
    public Song(){
    songName = "Perfect";
    author = "Ed Sheeran";
    year = 2017;
    genre = "pop";
    }
    public void Change() {
        songName = "Just Say you won't let go";
        author = "James Arthur";
        year = 2016;
        genre = "pop";
    }
}