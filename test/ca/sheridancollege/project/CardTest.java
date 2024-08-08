/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package ca.sheridancollege.project;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author jasle
 */
public class CardTest {
    
    public CardTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

     /**
     * Test of getSuit method, of class Card.
     */
    @Test
    public void testGetSuitGood() {
        System.out.println("testGetSuitGood");
        Card instance = new Card("Hearts", "Ace");
        String expResult = "Hearts";
        String result = instance.getSuit();
        assertEquals(expResult, result);
    }

    @Test
    public void testGetSuitBad() {
        System.out.println("testGetSuitBad");
        Card instance = new Card("Spades", "King");
        String expResult = "Clubs"; // This should fail
        String result = instance.getSuit();
        assertEquals(expResult, result);
    }

    @Test
    public void testGetSuitBoundary() {
        System.out.println("testGetSuitBoundary");
        Card instance = new Card("", "Ace"); // Edge case with empty suit
        String expResult = "";
        String result = instance.getSuit();
        assertEquals(expResult, result);
    }

    /**
     * Test of setSuit method, of class Card.
     */
    @Test
    public void testSetSuit() {
        System.out.println("testSetSuit");
        Card instance = new Card("Hearts", "Ace");
        instance.setSuit("Diamonds");
        String expResult = "Diamonds";
        String result = instance.getSuit();
        assertEquals(expResult, result);
    }

    /**
     * Test of getRank method, of class Card.
     */
    @Test
    public void testGetRankGood() {
        System.out.println("testGetRankGood");
        Card instance = new Card("Hearts", "Ace");
        String expResult = "Ace";
        String result = instance.getRank();
        assertEquals(expResult, result);
    }

    @Test
    public void testGetRankBad() {
        System.out.println("testGetRankBad");
        Card instance = new Card("Hearts", "King");
        String expResult = "Queen"; // This should fail
        String result = instance.getRank();
        assertEquals(expResult, result);
    }

    @Test
    public void testGetRankBoundary() {
        System.out.println("testGetRankBoundary");
        Card instance = new Card("Hearts", ""); // Edge case with empty rank
        String expResult = "";
        String result = instance.getRank();
        assertEquals(expResult, result);
    }

    /**
     * Test of toString method, of class Card.
     */
    @Test
    public void testToStringGood() {
        System.out.println("testToStringGood");
        Card instance = new Card("Hearts", "Ace");
        String expResult = "Ace of Hearts";
        String result = instance.toString();
        assertEquals(expResult, result);
    }

    @Test
    public void testToStringBad() {
        System.out.println("testToStringBad");
        Card instance = new Card("Spades", "King");
        String expResult = "Queen of Spades"; // This should fail
        String result = instance.toString();
        assertEquals(expResult, result);
    }

    @Test
    public void testToStringBoundary() {
        System.out.println("testToStringBoundary");
        Card instance = new Card("", ""); // Edge case with empty suit and rank
        String expResult = " of "; // Expecting " of " for empty values
        String result = instance.toString();
        assertEquals(expResult, result);
    }
    
    public class Card {

        private String suit;
        private String rank;

        public Card(String suit, String rank) {
            this.suit = suit;
            this.rank = rank;
        }

        public String getSuit() {
            return suit;
        }

        public void setSuit(String suit) {
            this.suit = suit;
        }

        public String getRank() {
            return rank;
        }

        public void setRank(String rank) {
            this.rank = rank;
        }

        @Override
        public String toString() {
            return rank + " of " + suit;
        }
    }
    
}
