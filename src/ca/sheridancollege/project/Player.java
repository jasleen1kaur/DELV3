/**
 * SYST 17796 Project Base code.
 * Students can modify and extend to implement their game.
 * Add your name as an author and the date!
 */
package ca.sheridancollege.project;

/**
 * A class that models each Player in the game. Players have an identifier, which should be unique.
 *
 * @author dancye
 * @author Paul Bonenfant Jan 2020
 */
public abstract class Player {
    private String name;
    private GroupOfCards group;

    public Player(String name) {
        this.name = name;
        this.group = new GroupOfCards();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public GroupOfCards getGroup() {
        return group;
    }

    public void setGroup(GroupOfCards group) {
        this.group = group;
    }

    public abstract void play();
}