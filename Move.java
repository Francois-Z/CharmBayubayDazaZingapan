import java.util.ArrayList;

public class Move{
    protected String name;
    protected ArrayList<Character> targetList = new ArrayList<Character>();
    protected ArrayList<Integer> actionList = new ArrayList<Integer>();

    
    public void act(){
        /*for each targetList, do action */
    }

    //getters
    public String getName(){
        return name;
    }
}