package com.company.Game;

import java.util.Scanner;

public class Runner {

    public static void main(String[] args)
    {
        System.out.println("Welcome to the tough top tavern. If you can go through the go through the basement dungeon ");
        System.out.println("from the top left of the board to the bottom right and bring back my great ");
        System.out.println("grandfather's without dying from the monsters, you get a lifetime of free drinks. Many");
        System.out.println("have tried and many have failed but you seem like a tough knight, got some fight in ya.");
        System.out.println("Say, was that basement Small, Medium, or Large?");
        Scanner input = new Scanner(System.in);
        String instr = input.nextLine();

        int boardsizeX , int boardsizeY;
        if(instr.equalsIgnoreCase("Small")) {
            boardsizeX = boardsizeY = 5;
            System.out.println("");
        }
        if(instr.equalsIgnoreCase("Medium")) {
            boardsizeX = boardsizeY = 7;
            System.out.println("It was a bit cramped...");
        }
        if(instr.equalsIgnoreCase("Large")) {
            boardsizeX = boardsizeY = 9;
            System.out.println("");
        }

    }
}

