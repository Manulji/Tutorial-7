import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import java.util.Scanner;

public class PlayerSelection {
    private String method;
    private static Player P;


    Scanner input = new Scanner(System.in);
    public PlayerSelection() {

        this.method = input.next().toUpperCase(Locale.ROOT);
        if(method.equals("A")){
            addPlayer();

        }else if(method.equals("V")){
           viewPlayers();
        }else if(method.equals("B")){
            bestBatsman();
        }else if(method.equals("C")){
            bestBowler();
        }else if(method.equals("D")){
            bestKeeper();
        }
    }

    public void addPlayer(){
        System.out.println("Enter player Name: ");
        String name = input.next();
        System.out.println("Enter player Age: ");
        int age = input.nextInt();
        System.out.println("Enter player Type: ");
        String PlayerType = input.next();
        System.out.println("Enter player Runs: ");
        int runs = input.nextInt();
        System.out.println("Enter player Wickets: ");
        int wickets = input.nextInt();

        P = new Player(name,age,PlayerType,runs,wickets);
        ArrayList<Player> players = P.getPlayers1();
        players.add(P);
        System.out.println("Player added!");
    }

    public void viewPlayers(){
        ArrayList<Player> players = P.getPlayers1();
        Iterator itr = players.iterator();
        while(itr.hasNext()) {
            P = (Player) itr.next();
            System.out.println("Name: "+P.name +"\nAge: "+P.age+"\nPlayer Type: "+P.PlayerType+"\n");
        }

        System.out.println(players);
    }

    private void bestBatsman(){
        ArrayList<Player> players = P.getPlayers1();
        String nameIterate = players.get(0).getName();
        int runsIterate = players.get(0).getRuns();
        for (int i=0; i< players.size(); i++) {
            if (runsIterate < players.get(i).getRuns()) {
                nameIterate = players.get(i).getName();
                runsIterate = players.get(i).getRuns();
            }
        }
        System.out.println(nameIterate + " is the best-batsman with " + runsIterate + "runs");
    }

    private void bestBowler(){
        ArrayList<Player> players = P.getPlayers1();
        String nameIterate = players.get(0).getName();
        int wicketsIterate = players.get(0).getWickets();
        for (int i=0; i< players.size(); i++) {
            if (wicketsIterate < players.get(i).getWickets()) {
                nameIterate = players.get(i).getName();
                wicketsIterate = players.get(i).getWickets();
            }
        }
        System.out.println(nameIterate + " is the best-bowler with " + wicketsIterate + "wickets");
    }
    private void bestKeeper(){
        ArrayList<Player> players = P.getPlayers1();
        String nameIterate = players.get(0).getName();
        int wicketsIterate = players.get(0).getWickets();
        for (int i=0; i< players.size(); i++) {
            if (wicketsIterate < players.get(i).getWickets()) {
                nameIterate = players.get(i).getName();
                wicketsIterate = players.get(i).getWickets();
            }
        }
        System.out.println(nameIterate + " is the best-bowler with " + wicketsIterate + "wickets");
    }
}
