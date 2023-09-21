package Multithreading.Exchanger;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Exchanger;

public class Example1 {
    public static void main(String[] args) {
        Exchanger<Action> exchanger = new Exchanger<>();

        List<Action> player1Actions = new ArrayList<>();

        player1Actions.add(Action.PAPER);
        player1Actions.add(Action.ROCK);
        player1Actions.add(Action.SCISSORS);

        List<Action> player2Actions = new ArrayList<>();

        player2Actions.add(Action.SCISSORS);
        player2Actions.add(Action.ROCK);
        player2Actions.add(Action.PAPER);

        new BestFriend("Dmitry", player1Actions, exchanger);
        new BestFriend("Zakhar", player2Actions, exchanger);

    }
}

enum Action {
    ROCK, SCISSORS, PAPER;
}

class BestFriend extends Thread {
    String name;
    List<Action> actions;
    Exchanger<Action> exchanger;

    public BestFriend(String name, List<Action> actions, Exchanger<Action> exchanger) {
        this.name = name;
        this.actions = actions;
        this.exchanger = exchanger;
        this.start();
    }

    private void whoWins(Action myAction, Action friendAction){
        if ((myAction == Action.ROCK && friendAction == Action.SCISSORS)
            ||(myAction == Action.SCISSORS && friendAction == Action.PAPER)
            ||(myAction == Action.PAPER && friendAction == Action.ROCK)) {
            System.out.println(name + " WINS!");
        }
    }

    @Override
    public void run(){
        Action reply;
        for (Action action : actions){
            try {
                reply = exchanger.exchange(action);
                whoWins(action, reply);
                sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

}