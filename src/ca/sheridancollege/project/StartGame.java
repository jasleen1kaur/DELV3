/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ca.sheridancollege.project;

import java.util.Scanner;

/**
 *
 * @author jasle
 */
public class StartGame {
     public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);

        System.out.print("Player 1: ");
        String player_1 = scanner.nextLine();

        System.out.print("Player 2: ");
        String player_2 = scanner.nextLine();

        int maxRounds = 3; 
        War warInstance = new War(player_1, player_2, maxRounds);
        warInstance.play();
        warInstance.declareWinner();

        scanner.close();
    }
    
}
