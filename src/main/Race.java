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

			if (tortoise.getRaceTime() < rabbit.getRaceTime()) {
                winner = "TORTOISE";
            } else if(tortoise.getRaceTime() == rabbit.getRaceTime()){
                winner = "NOBODY";
            } else {
                winner = "RABBIT";
            }
		}
		
		System.out.println("Rabbit has completed the race in " + rabbit.getRaceTime() + " seconds.");
	    System.out.println("Tortoise has completed the race in " + tortoise.getRaceTime() + "seconds.");
		JOptionPane.showMessageDialog(null, winner + " HAS WON THE RACE.", "RESULT", JOptionPane.INFORMATION_MESSAGE);
    }
}
