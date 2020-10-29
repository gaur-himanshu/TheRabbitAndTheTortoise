package main;

import thread.rabbit.Rabbit;
import thread.tortoise.Tortoise;

import javax.swing.*;

public class Race {
    public static void main(String[] args) {
		String winner;
        Rabbit rabbit = new Rabbit();
        rabbit.getRabbit().start();
		Tortoise tortoise = new Tortoise;
		tortoise.getTortoise().start();
		
		while ((rabbit.getRabbit().isAlive() || tortoise.getTortoise().isAlive())) {

			if (tortoise.getRaceTimeTortoise() < rabbit.getRaceTimeRabbit()) {
                winner = "TORTOISE";
            } else if(tortoise.getRaceTimeTortoise() == rabbit.getRaceTimeRabbit()){
                winner = "NOBODY";
            } else {
                winner = "RABBIT";
            }
		}
		System.out.println("Rabbit has completed the race in " + rabbit.getRaceTimeRabbit() + " seconds.");
	    System.out.println("Tortoise has completed the race in " + tortoise.getRaceTimeTortoise() + "seconds.");
		JOptionPane.showMessageDialog(null, winner + " HAS WON THE RACE.", "RESULT", JOptionPane.INFORMATION_MESSAGE);
    }
}
