package Generics1.Game;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Team <T extends Participant>{
    private String name;
    private List<T> participants = new ArrayList<>();

    public Team(String name) {
        this.name = name;
    }

    public void addNewParticipant(T participant){
        this.participants.add(participant);
        System.out.println("In team " + this.name + " was added new participant with name " + participant.getName());
    }

    public void playWith(Team<T> team){
        String winnerName;
        Random random = new Random();
        int score = random.nextInt(2);
        if (score == 0 ) System.out.println("Team " + this.name + " has won the game");
        else System.out.println("Team " + team.name + " has won the game");
    }
}
