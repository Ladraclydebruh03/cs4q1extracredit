package Ph15_Ladra_Exercise3;
public class MainMethod {
    public static void main(String[] args){
        Items shoes = new Items("shoes", "Nike", 11500);
        Items mic = new Items("microphone", "Shure", 3000);
        Items dress = new Items("dress", "Ukay-ukay", 500);
        
        Song song = new Song();
        
        Singer singer = new Singer("Totoy Mandirigma", 0);
        
        System.out.println("The singer has " + shoes.getbrand() + " " + shoes.getitem() + " and it costs " + shoes.getcost());
        System.out.println("The singer has " + mic.getbrand() + " " + mic.getitem() + " and it costs " + mic.getcost());
        System.out.println("The singer has " + dress.getbrand() + " " + dress.getitem() + " and it costs " + dress.getcost());
        System.out.println("");
        
        System.out.println("The first song is " + song.getsongName() + ", a " + song.getgenre() + " song made by " + song.getauthor() + " in " + song.getyear());
        song.Change();
        System.out.println("The second song is " + song.getsongName() + ", a " + song.getgenre() + " song made by " + song.getauthor() + " in " + song.getyear());
        
        System.out.println("\nName of Singer: " + singer.getname() + "\n\nNo. of performance: " + singer.getnoOfPerformances());
        System.out.println("Earnings: " + singer.getearnings() + "\nFavorite song: " + singer.favoriteSong.getsongName());
        
        singer.performForAudience("Buboy",12);
        singer.changeFavSong();
        
        System.out.println("\nNo. of performances: " + singer.getnoOfPerformances());
        System.out.println("Earnings: " + singer.getearnings() + "\nNew Favorite song: " + singer.favoriteSong.getsongName());
        
        System.out.println("\nPerformed with: " + singer.getOtherSinger() + "\nHis earnings: " + singer.getOtherEarnings());
        System.out.println("\nTotal performances: " + singer.getTotalPerformances());
    }
}