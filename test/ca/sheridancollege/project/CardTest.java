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
    public void testGetSuit() {
        System.out.println("getSuit");
        Card instance = null;
        String expResult = "";
        String result = instance.getSuit();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }//

    /**
     * Test of setSuit method, of class Card.
     */
    @Test
    public void testSetSuit() {
        System.out.println("setSuit");
        String suit = "";
        Card instance = null;
        instance.setSuit(suit);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRank method, of class Card.
     */
    @Test
    public void testGetRank() {
        System.out.println("getRank");
        Card instance = null;
        String expResult = "";
        String result = instance.getRank();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setRank method, of class Card.
     */
    @Test
    public void testSetRank() {
        System.out.println("setRank");
        String rank = "";
        Card instance = null;
        instance.setRank(rank);
        // TODO review the generated test code and remove the default call to fail.
        //ail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Card.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Card instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    @Test
    public void testGetSuitGood() {
        System.out.println("testGetSuitGood");
        Card instance = new Card("Hearts", "Ace") {
            @Override
            public String toString() {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }
        };
        boolean expResult = true;
        boolean result = "Hearts".equals(instance.getSuit());
        assertEquals(expResult, result);
    }

    /**
     * Test of getSuit method with bad scenario.
     */
    @Test
    public void testGetSuitBad() {
        System.out.println("testGetSuitBad");
        Card instance = new Card("Spades", "King") {
            @Override
            public String toString() {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }
        };
        boolean expResult = false; // This should return false
        boolean result = "Clubs".equals(instance.getSuit());
        assertEquals(expResult, result);
    }

    /**
     * Test of getSuit method with boundary scenario.
     */
    @Test
    public void testGetSuitBoundary() {
        System.out.println("testGetSuitBoundary");
        Card instance = new Card("", "Ace") {
            @Override
            public String toString() {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }
        }; // Edge case with empty suit
        boolean expResult = true;
        boolean result = "".equals(instance.getSuit());
        assertEquals(expResult, result);
    }

    

    /**
     * Test of getRank method with good scenario.
     */
    @Test
    public void testGetRankGood() {
        System.out.println("testGetRankGood");
        Card instance = new Card("Hearts", "Ace") {
            @Override
            public String toString() {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }
        };
        boolean expResult = true;
        boolean result = "Ace".equals(instance.getRank());
        assertEquals(expResult, result);
    }

    /**
     * Test of getRank method with bad scenario.
     */
    @Test
    public void testGetRankBad() {
        System.out.println("testGetRankBad");
        Card instance = new Card("Hearts", "King") {
            @Override
            public String toString() {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }
        };
        boolean expResult = false; // This should return false
        boolean result = "Queen".equals(instance.getRank());
        assertEquals(expResult, result);
    }

    /**
     * Test of getRank method with boundary scenario.
     */
    @Test
    public void testGetRankBoundary() {
        System.out.println("testGetRankBoundary");
        Card instance = new Card("Hearts", "") {
            @Override
            public String toString() {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }
        }; // Edge case with empty rank
        boolean expResult = true;
        boolean result = "".equals(instance.getRank());
        assertEquals(expResult, result);
    }

    /**
     * Test of toString method with good scenario.
     */
    @Test
    public void testToStringGood() {
        System.out.println("testToStringGood");
        Card instance = new Card("Hearts", "Ace") {
            @Override
            public String toString() {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }
        };
        boolean expResult = true;
        boolean result = "Ace of Hearts".equals(instance.toString());
        assertEquals(expResult, result);
    }

    /**
     * Test of toString method with bad scenario.
     */
    @Test
    public void testToStringBad() {
        System.out.println("testToStringBad");
        Card instance = new Card("Spades", "King") {
            @Override
            public String toString() {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }
        };
        boolean expResult = false; // This should return false
        boolean result = "Queen of Spades".equals(instance.toString());
        assertEquals(expResult, result);
    }

    /**
     * Test of toString method with boundary scenario.
     */
    @Test
    public void testToStringBoundary() {
        System.out.println("testToStringBoundary");
        Card instance = new Card("", "") {
            @Override
            public String toString() {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }
        }; // Edge case with empty suit and rank
        boolean expResult = true;
        boolean result = " of ".equals(instance.toString());
        assertEquals(expResult, result);
    }
    public class CardImpl extends Card {

        public CardImpl() {
            super("", "");
        }

        @Override
        public String toString() {
            return "";
        }
    }
    
}
