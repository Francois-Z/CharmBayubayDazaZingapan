import java.util.ArrayList;

public class MainChar extends Character {
    private int maxStamina, stamina;

    public MainChar(String n, int mh, ArrayList<Move> ml, int ms){
        super(n, mh, ml);
        maxStamina = ms;
        stamina = ms;
    }
    
    //getters
    public int getStamina(){
        return stamina;
    }
    public int getMaxStamina(){
        return maxStamina;
    }
}