import java.util.ArrayList;

public abstract class Character{
    protected String name;
    protected int hp;
    protected int maxHP;
    protected boolean isDead;
    protected ArrayList<Move> moveList = new ArrayList<Move>();

    public Character(String n, int mh, ArrayList<Move> ml){
        name = n;
        maxHP = mh;
        hp = mh;
        moveList = ml;
        isDead = true;
    }

    //common moves
    public void die(){
        isDead = true;
    }
    public void flee(){
        //flee from the scene
    }

    public void rest(){
        changeHP(5); //sample rest
    }

    //setters
    public void changeHP(int inc) {
        hp =+ inc;
    }


    //getters
    public int getHP(){
        return hp;
    }
    public int getMaxHP(){
        return maxHP;
    }
    public boolean isDead(){
        return isDead;
    }
    public ArrayList<Move> moveList(){
        return moveList;
    }
}