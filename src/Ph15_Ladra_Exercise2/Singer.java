package Ph15_Ladra_Exercise2;
public class Singer {
    String name;
    int noOfPerformances;
    double earnings;
    Song favoriteSong = new Song();
    
    public Singer(String n, int nOP, double e) {
       name = n;
       noOfPerformances = nOP;
       earnings = e;
    }
    
    public void performForAudience(int Audience){
        noOfPerformances += 1;
        earnings += Audience * 100;
    }
    public void changeFavSong(){
        favoriteSong.Change();
    }
}