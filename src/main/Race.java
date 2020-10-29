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
    }
}
