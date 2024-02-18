package com.SimonFraserUniversity.DucDuyPham;

public class EnchantedMazeFactory extends MazeFactory {
    @Override
    public Room makeRoom() {
        return new EnchantedRoom(castSpell());
    }

    @Override
    public Door makeDoor(Room room1, Room room2) {
        return new DoorNeedingSpell(room1, room2, castSpell());
    }

    private Spell castSpell() {
        return new Spell();
    }

    // Implement other factory methods if necessary
}
