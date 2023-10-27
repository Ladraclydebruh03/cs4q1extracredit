package Ph15_Ladra_Exercise3;
public class Items{
    private String item, brand;
    private int cost;
    
    public Items(String itemArg, String brandArg, int costArg){
        item = itemArg;
        brand = brandArg;
        cost = costArg;
    }
    public String getitem(){
        return item;
    }
    public String getbrand(){
        return brand;
    }
    public int getcost(){
        return cost;
    }
}