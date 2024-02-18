package com.SimonFraserUniversity.DucDuyPham;

/**
 * Concrete factory:
 * An enchanted maze factory that creates magical components for the maze,
 * such as EnchantedRooms and DoorsNeedingSpells.
 * This factory extends the Abstract Factory class MazeFactory and create
 * enchanted versions of maze components.
 */
public class EnchantedMazeFactory extends MazeFactory {
    /**
     * Creates an enchanted room with a spell.
     *
     * @return A new EnchantedRoom with the default spell.
     */
    @Override
    public Room makeRoom() {
        return new EnchantedRoom(castSpell());
    }

    /**
     * Creates a door that needs spell between two rooms
     *
     * @param room1 The first room the door connects.
     * @param room2 The second room the door connects.
     * @return A new DoorNeedingSpell with the default spell
     */
    @Override
    public Door makeDoor(Room room1, Room room2) {
        return new DoorNeedingSpell(room1, room2, castSpell());
    }

    /**
     * Casts a spell for EnchantedRoom and DoorNeedingSpell
     *
     * @return A new Spell object.
     */
    private Spell castSpell() {
        return new Spell();
    }
}
