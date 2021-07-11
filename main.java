package Tutorials;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Player P1 = new Player("Dawid Malan",33,"batsman",28,30);
        P1.playercall(P1);
        Player P2 = new Player("Umar Gul",28,"bowler",20,28);
        P1.playercall(P2);
        Player P3 = new Player("Shane watson",32,"keeper",19,25);
        P1.playercall(P3);
        Player P4 = new Player("Tabraiz Shamsi",30,"batsman",12,20);
        P1.playercall(P4);
        Player P5 = new Player("Mohommad Nabi",27,"keeper",10,22);
        P1.playercall(P5);
        Player P6 = new Player("Trent Boult",26,"bowler",15,27);
        P1.playercall(P6);

        while(true) {
            System.out.println("Enter 'S' To continue / Enter 'E' To Exit");
            String X = sc.next();
            if(X.equalsIgnoreCase("s")){
                System.out.println("Enter 'A' to Add a Player \n Enter 'V' to Show player Details");
                System.out.println("B: Display two best batmans\n" +
                        "C: Display two best bowlers\n" +
                        "D: Display the best Keeper");
                new PlayerSelection();

            }else if(X.equalsIgnoreCase("E")){
                break;
            }
        }
    }
}     
