import java.util.ArrayList;

public class Choice {
    private String name;
    private Scenario nextScenario;
    private static ArrayList<Choice> choiceList = new ArrayList<Choice>();
    
    public Choice(String n, Scenario s, ArrayList<Choice> cl){
        name = n;
        nextScenario = s;
        choiceList = cl;
        choiceList.add(this);
    }
    public void switchScenario(){
        //move to next scenario
    }

    //getters
    public String getName(){
        return name;
    }
    public ArrayList<Choice> getChoices(){
        return choiceList;
    }
    public Scenario getNextScenario(){
        return nextScenario;
    }
    
}