package com.SimonFraserUniversity.DucDuyPham;

/**
 * Abstract product:
 * Represents an enchanted room in the maze. Concrete product of the abstract product class Room.
 * Included spell-related modification to the normal Room and create the Enchanted room
 */
public class EnchantedRoom extends Room {
    private Spell spell;

    /**
     * Constructs an EnchantedRoom with a specified spell.
     * 
     * @param spell The spell associated with this enchanted room. The spell can have various effects
     *              and is part of what makes the room enchanted.
     */
    public EnchantedRoom(Spell spell) {
        super();
        this.spell = spell;
        System.out.println("The current spell for " + this.toString() + " is: " + spell.getName());
    }

     /**
     * Simulates entering the enchanted room. This method overrides the enter method
     * in the Room class.
     */
    @Override
    public void enter() {
        System.out.println("Entered an Enchanted Room with a spell: " + spell.getName());
    }

     /**
     * Provide a string representation of the enchanted room element, with the room number
     * 
     * @return A string that represents the Enchanted room number.
     */
    @Override
    public String toString() {
        return "Enchanted Room #" + roomNum;
    }
}
