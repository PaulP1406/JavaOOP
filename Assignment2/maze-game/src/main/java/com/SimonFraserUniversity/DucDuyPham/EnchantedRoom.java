package com.SimonFraserUniversity.DucDuyPham;

public class EnchantedRoom extends Room {
    private Spell spell;

    public EnchantedRoom(Spell spell) {
        super();
        this.spell = spell;
        System.out.println("The current spell for " + this.toString() + " is: " + spell.getName());
    }

    @Override
    public void enter() {
        System.out.println("Entered an Enchanted Room with a spell: " + spell.getName());
    }

    @Override
    public String toString() {
        return "Enchanted Room #" + roomNum;
    }
}
