package com.SimonFraserUniversity.DucDuyPham;

/**
 * Concrete product class, represents a door in the maze that requires a spell
 * to open, extending the Abstract product Door class
 */
public class DoorNeedingSpell extends Door {
    private Spell spell;

    /**
     * Constructs a DoorNeedingSpell with 2 rooms and a spell.
     *
     * @param room1 The first room connected by the door.
     * @param room2 The second room connected by the door.
     * @param spell The spell associated with the door.
     */
    public DoorNeedingSpell(Room room1, Room room2, Spell spell) {
        super(room1, room2);
        this.spell = spell;
        System.out.println("The current spell for " + this.toString() + " is : " + spell.getName());
    }

    /**
     * Priting messages to simulate going entering a Door that needed a spell to go
     * through
     * Prints a message indicating whether entering the door is successful or if the
     * door remains locked.
     */
    @Override
    public void enter() {
        if (isOpen) {
            System.out.println("Passing through a magical door with a spell: " + spell.getName());
        } else {
            System.out.println("This door is locked and requires a spell to open.");
        }
    }

    /**
     * Provide a string representation of the door element, indicating that the door needs
     * spell to separate from the normal door, with the door number
     *
     * @return A string that represents this DoorNeedingSpell
     */
    @Override
    public String toString() {
        return "DoorNeedingSpell #" + doorNum;
    }
}
