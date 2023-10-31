package Ph15_Ladra_Exercise2;
public class MainMethod {
    public static void main(String[] args){
        Items shoes = new Items("shoes", "Nike", 11500);
        Items mic = new Items("microphone", "Shure", 3000);
        Items dress = new Items("dress", "Ukay-ukay", 500);
        
        Song song = new Song();
        
        Singer singer = new Singer("Totoy Mandirigma", 0, 0);
        
        System.out.println("The singer has " + shoes.brand + " " + shoes.item + " and it costs " + shoes.cost);
        System.out.println("The singer has " + mic.brand + " " + mic.item + " and it costs " + mic.cost);
        System.out.println("The singer has " + dress.brand + " " + dress.item + " and it costs " + dress.cost);
        System.out.println("");
        
        System.out.println("The first song is " + song.songName + ", a " + song.genre + " song made by " + song.author + " in " + song.year);
        song.Change();
        System.out.println("The second song is " + song.songName + ", a " + song.genre + " song made by " + song.author + " in " + song.year);
        
        System.out.println("\nName of Singer: " + singer.name + "\n\nNo. of performance: " + singer.noOfPerformances);
        System.out.println("Earnings: " + singer.earnings + "\nFavorite song: " + singer.favoriteSong.songName);
        
        singer.performForAudience(12);
        singer.changeFavSong();
        
        System.out.println("\nNo. of performances: " + singer.noOfPerformances);
        System.out.println("Earnings: " + singer.earnings + "\nNew Favorite song: " + singer.favoriteSong.songName);
    }
}