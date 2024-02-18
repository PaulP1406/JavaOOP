package com.SimonFraserUniversity.DucDuyPham;

/**
 * Represents a spell, which can be associated with enchanted rooms or
 * doors requiring spells to open.
 */
public class Spell {
    private String name; // THe name of the spell

    /**
     * Constructs a default Spell if there is no name provided
     */
    public Spell() {
        this.name = "Spell";
    }

    /**
     * Constructs a Spell with a specified name.
     *
     * @param name The name of the spell.
     */
    public Spell(String name) {
        this.name = name;
    }

    /**
     * Provide the name of the spell.
     *
     * @return The name of the spell.
     */
    public String getName() {
        return name;
    }
}
