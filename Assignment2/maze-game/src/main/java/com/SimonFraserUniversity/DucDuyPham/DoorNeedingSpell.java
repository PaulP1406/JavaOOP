package com.SimonFraserUniversity.DucDuyPham;

public class DoorNeedingSpell extends Door {
    private Spell spell;

    public DoorNeedingSpell(Room room1, Room room2, Spell spell) {
        super(room1, room2);
        this.spell = spell;
        System.out.println("The current spell for " + this.toString() + " is : " + spell.getName());
    }

    @Override
    public void enter() {
        if (isOpen) {
            System.out.println("Passing through a magical door with a spell: " + spell.getName());
        } else {
            System.out.println("This door is locked and requires a spell to open.");
        }
    }

    @Override
    public String toString() {
        return "DoorNeedingSpell #" + doorNum;
    }
}
