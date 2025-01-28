package HW2.CoinCollection;

import java.util.ArrayList;

/**
 * A class that maintains information about an arbitrarily large coin collection.  
 * Individual coins may be accessed based on the order that they are inserted.  
 * 
 * @author William Goble, Grant Braught, Tim Wahls, Louis Ziantz
 * @author (YOUR NAME HERE)
 * @version (PUT DATE HERE)
 */
public class CoinCollection {
    private String collectionName;      // The name of the collection
    private ArrayList<Coin> coinList;   // The list of coins in the collection

    /**
     * Create a new coin collection.
     * 
     * @param initCollName the name of the collection
     */
    public CoinCollection(String initCollName) {
        // Add Code here
    }

    /**
     * Return the name of the coin collection
     * @return the name of the collection
     */
    public String getCollectionName() {
        // Replace with your code
        return null;
    }

    /**
     * Add a coin to the collection
     * @param coin the coin to be added to the collection
     */
    public void addCoin(Coin coin) {
        // add your code here
    }

    /**
     * Remove the coin at the indicated index in the collection.
     * If the specified index is not valid, then print an error message
     * @param index
     */
    public void removeCoin(int index) {
        // add your code here
    }

    /**
     * Return the size of the CoinCollection
     * @return
     */
    public int sizeOfCollection() {
        // replace this with your code
        return 0;
    }

    /**
     * Print a full description of the Coin at the specified index in the collection.
     * If the specified index is not valid, then print an error message
     * @param index the omdex pf the Coin to be printied.
     */
    public void printCoin(int index) {
        // Add code here
        // Hint: You can call the toString method in the Coin class to get 
        // a String describing the Coin, then print the String.
    }
} 
