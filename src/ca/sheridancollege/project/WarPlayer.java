/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ca.sheridancollege.project;

/**
 *
 * @author jasle
 */
public class WarPlayer extends Player {

    public WarPlayer(String name) {
        super(name);
    }

    @Override
    public void play() {
        // Implement player-specific logic if necessary
    }

    public Card playCard() {
        return getGroup().drawCard();
    }
}