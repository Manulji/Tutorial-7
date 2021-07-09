import java.util.ArrayList;

public class Player {
    public String name;
    public int age;
    private int runs;
    private int wickets;
    public String PlayerType;
    private static ArrayList<Player> players1 = new ArrayList<Player>();


    public Player(String name, int age, String playerType, int runs, Integer wickets) {
        this.setName(name);
        this.setAge(age);
        this.setPlayertype(playerType);
        this.setRuns(runs);
        this.setWickets(wickets);
    }

    public void setName(String name) {
        this.name = name;

    }
    public String getName() {
        return name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public int getAge() {
        return age;
    }

    public double battingAvg(){
        double battingAvg = runs / 15.0;
        return battingAvg;}

    public double bowlingAvg() {
        double bowlingAvg = wickets / 15.0;
        return bowlingAvg;
    }
    public void getPlayerDetails(){
            System.out.println("Name: "+ getName());
            System.out.println("Age: "+ getAge());
            System.out.println("Type of player: "+ getPlayerType());
            System.out.println("No. of Wickets scored: "+ getWickets());
            System.out.println("No. of runs: "+ getRuns());
    }


    public void setPlayertype(String player_Type) {
        this.PlayerType= player_Type;
    }

    public String getPlayerType() {

       return this.PlayerType;
    }

    public int setRuns(int runs) {
       return this.runs = runs;
    }

    public int getRuns() {
        return runs;
    }

    public int setWickets(int wickets) {
        return this.wickets = wickets;
    }

    public int getWickets() {
        return wickets;
    }

    public void playercall(Player P){
        players1.add(P);

    }
    public ArrayList<Player> getPlayers1(){
        return players1;
    }
}
