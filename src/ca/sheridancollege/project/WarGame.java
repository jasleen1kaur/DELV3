/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ca.sheridancollege.project;

import java.util.List;

/**
 *
 * @author jasle
 */
public class WarGame extends Game {
    private final int maxRounds;
    private int currentRound;
    private WarPlayer player1;
    private WarPlayer player2;

    public WarGame(String player1Name, String player2Name, int maxRounds) {
        super("War");
        this.maxRounds = maxRounds;
        this.currentRound = 0;
        player1 = new WarPlayer(player1Name);
        player2 = new WarPlayer(player2Name);
        List<Player> players = List.of(player1, player2);
        setPlayers(players);
    }

    @Override
    public void play() {
        Deck deck = new Deck();
        deck.shuffle();
        dealCards(deck);

        while (currentRound < maxRounds && !player1.getGroup().isEmpty() && !player2.getGroup().isEmpty()) {
            playRound();
            currentRound++;
        }
    }

    private void dealCards(Deck deck) {
        while (!deck.getCards().isEmpty()) {
            player1.getGroup().addCard(deck.drawCard());
            if (!deck.getCards().isEmpty()) {
                player2.getGroup().addCard(deck.drawCard());
            }
        }
    }

    private void playRound() {
        Card card1 = player1.playCard();
        Card card2 = player2.playCard();

        System.out.println("Round " + (currentRound + 1) + ":");
        System.out.println(player1.getName() + " plays " + card1);
        System.out.println(player2.getName() + " plays " + card2);

        int result = compareCards(card1, card2);
        if (result > 0) {
            System.out.println(player1.getName() + " wins the round!");
            player1.getGroup().addCard(card1);
            player1.getGroup().addCard(card2);
        } else if (result < 0) {
            System.out.println(player2.getName() + " wins the round!");
            player2.getGroup().addCard(card1);
            player2.getGroup().addCard(card2);
        } else {
            System.out.println("It's a tie! War begins...");

           
            handleWar();
        }
    }

    private void handleWar() {
        if (player1.getGroup().getCards().size() < 4 || player2.getGroup().getCards().size() < 4) {
            System.out.println("One of the players does not have enough cards to continue the war.");
            return;
        }

        // Draw three cards face down
        Card[] faceDownCards1 = new Card[3];
        Card[] faceDownCards2 = new Card[3];

        for (int i = 0; i < 3; i++) {
            faceDownCards1[i] = player1.playCard();
            faceDownCards2[i] = player2.playCard();
        }

        // Draw one card face up
        Card faceUpCard1 = player1.playCard();
        Card faceUpCard2 = player2.playCard();

        System.out.println("War! " + player1.getName() + " plays " + faceUpCard1 + " face up.");
        System.out.println("War! " + player2.getName() + " plays " + faceUpCard2 + " face up.");

        int warResult = compareCards(faceUpCard1, faceUpCard2);
        if (warResult > 0) {
            System.out.println(player1.getName() + " wins the war!");
            player1.getGroup().addCard(faceUpCard1);
            player1.getGroup().addCard(faceUpCard2);
            // Collect all cards played in the war (face down + face up)
            for (int i = 0; i < 3; i++) {
                player1.getGroup().addCard(faceDownCards1[i]);
                player1.getGroup().addCard(faceDownCards2[i]);
            }
        } else if (warResult < 0) {
            System.out.println(player2.getName() + " wins the war!");
            player2.getGroup().addCard(faceUpCard1);
            player2.getGroup().addCard(faceUpCard2);
            // Collect all cards played in the war (face down + face up)
            for (int i = 0; i < 3; i++) {
                player2.getGroup().addCard(faceDownCards1[i]);
                player2.getGroup().addCard(faceDownCards2[i]);
            }
        } else {
            System.out.println("The war ends in a tie! No cards are taken.");
         
        }
    }

    private int compareCards(Card card1, Card card2) {
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
        int rank1 = java.util.Arrays.asList(ranks).indexOf(card1.getRank());
        int rank2 = java.util.Arrays.asList(ranks).indexOf(card2.getRank());

        return Integer.compare(rank1, rank2);
    }

    @Override
    public void declareWinner() {
        if (player1.getGroup().isEmpty() || player2.getGroup().isEmpty()) {
            if (player1.getGroup().isEmpty() && !player2.getGroup().isEmpty()) {
                System.out.println(player2.getName() + " wins the game!");
            } else if (!player1.getGroup().isEmpty() && player2.getGroup().isEmpty()) {
                System.out.println(player1.getName() + " wins the game!");
            } else {
                System.out.println("It's a tie!");
            }
        } else if (currentRound >= maxRounds) {
            if (player1.getGroup().getCards().size() > player2.getGroup().getCards().size()) {
                System.out.println(player1.getName() + " wins the game!");
            } else if (player1.getGroup().getCards().size() < player2.getGroup().getCards().size()) {
                System.out.println(player2.getName() + " wins the game!");
            } else {
                System.out.println("It's a tie!");
            }
        }
    }
}