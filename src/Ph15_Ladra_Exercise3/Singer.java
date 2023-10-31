package Ph15_Ladra_Exercise3;
public class Singer {
    private String name;
    private int noOfPerformances;
    private static double earnings = 0;
    Song favoriteSong = new Song();
    private static int totalPerformances = 0;
    private String otherSinger;
    private double otherEarnings;
    
    public Singer(String n, int nOP) {
       name = n;
       noOfPerformances = nOP;
       otherSinger = "N/A";
       otherEarnings = 0;
    }
    
    public void performForAudience(int Audience){
        noOfPerformances++;
        earnings += Audience * 100;
        totalPerformances++;
    }
    public void performForAudience(String otherSinger, int Audience){
        this.otherSinger = otherSinger;
        otherEarnings += Audience * 50;
        noOfPerformances++;
        earnings = otherEarnings;
        totalPerformances++;
    }
    public void changeFavSong(){
        favoriteSong.Change();
    }
    public String getname(){
        return name;
    }
    public int getnoOfPerformances(){
        return noOfPerformances;
    }
    public double getearnings(){
        return earnings;
    }
    public static int getTotalPerformances(){
        return totalPerformances;
    }
    public String getOtherSinger(){
        return otherSinger;
    }
    public double getOtherEarnings(){
        return otherEarnings;
    }
}