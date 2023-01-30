import java.util.HashMap;

public class Scenario {
    protected String name;
    protected HashMap<Character, String> charDialogue = new HashMap<Character, String>();

    public Scenario(String n, HashMap<Character, String> l){
        name = n;
        charDialogue = l;
    }

    //getters
    public String getName(){
        return name;
    }
    public HashMap<Character, String> getDialogues(){
        return charDialogue;
    }
}