package com.SimonFraserUniversity.DucDuyPham;

/**
 * Abstract factory:
 * Factory class for creating new maze components: Maze, Room, Wall, and Door.
 */
public class MazeFactory {
    /**
     * Constructs a MazeFactory object.
     */
    public MazeFactory() {
    }

    /**
     * Creates a new Maze object.
     *
     * @return A new Maze object.
     */
    public Maze makeMaze() {
        return new Maze();
    }

    /**
     * Creates a new Room object.
     *
     * @return A new Room object.
     */
    public Room makeRoom() {
        return new Room();
    }

    /**
     * Creates a new Wall object.
     *
     * @return A new Wall object.
     */
    public Wall makeWall() {
        return new Wall();
    }

    /**
     * Creates a new Door object connecting two specified rooms.
     *
     * @param room1 The first room to connect.
     * @param room2 The second room to connect.
     * @return A new Door object.
     */
    public Door makeDoor(Room room1, Room room2) {
        return new Door(room1, room2);
    }
}
