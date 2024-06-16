/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ca.sheridancollege.project;

import java.util.ArrayList;

/**
 *
 * @author jasle
 */
public class War extends Game{
    
   private final Deck deck;
    private final Player player1;
    private final Player player2;
    private final int roundLimit;
    private int currentRound;

    public War(String player_1, String player_2, int roundLimit) {
        super("War");
        deck = new Deck();
        deck.shuffle();
        player1 = new Player(player_1) {
            @Override
            public void play() {
                throw new UnsupportedOperationException("Not supported yet.");
            }
        };
        player2 = new Player(player_2) {
            @Override
            public void play() {
                throw new UnsupportedOperationException("Not supported yet.");
            }
        };
        dealCards();
        this.roundLimit = roundLimit;
        currentRound = 0;
    }

    private void dealCards() {
        ArrayList<Card> deckCards = deck.getCards();
        for (int i = 0; i < deckCards.size(); i++) {
            if (i % 2 == 0) {
                player1.getGroup().addCard(deckCards.get(i));
            } else {
                player2.getGroup().addCard(deckCards.get(i));
            }
        }
    }

    @Override
    public void play() {
        while (!player1.getGroup().isEmpty() && !player2.getGroup().isEmpty() && currentRound < roundLimit) {
            currentRound++;
            startRound();
        }
        declareWinner();
    }

    private void startRound() {
        Card card1 = player1.playCard();
        Card card2 = player2.playCard();
        System.out.println(player1.getName() + " plays: " + card1);
        System.out.println(player2.getName() + " plays: " + card2);

        int comparison = card1.getRank().compareTo(card2.getRank());
        if (comparison > 0) {
            System.out.println("Winner of the round: " + player1.getName());
            player1.getGroup().addCard(card1);
            player1.getGroup().addCard(card2);
        } else if (comparison < 0) {
            System.out.println("Winner of the round: " + player2.getName());
            player2.getGroup().addCard(card1);
            player2.getGroup().addCard(card2);
        } else {
            System.out.println("Round Tied between players");
        }
    }

    @Override
    public void declareWinner() {
        if (player1.getGroup().isEmpty() || currentRound >= roundLimit) {
            System.out.println(player2.getName() + " wins the game!");
        } else {
            System.out.println(player1.getName() + " wins the game!");
        }
    }
}
