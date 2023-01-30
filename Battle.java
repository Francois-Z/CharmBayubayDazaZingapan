import java.util.ArrayList;
import java.util.HashMap;

public class Battle extends Scenario{
    private ArrayList<Enemy> enemyList = new ArrayList<Enemy>();

    public Battle(String n, HashMap<Character, String> cd, ArrayList<Enemy> el){
        super(n, cd);
        enemyList = el;
    }
    public void generateCharacters(){
        //generate characters could be exclusive to view instead
    }
}