package mx.iteso.observer;

/**
 * Created by lamos on 9/22/2016.
 */
public class Scorer {
    public String name;
    public int number;
    public String position;
    public String team;

    public void ScorerGoal(String name, int number, String position, String team){
        this.name = name;
        this.number = number;
        this.position = position;
        this.team = team;
    }
}
