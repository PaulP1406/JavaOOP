package com.SimonFraserUniversity.DucDuyPham;

import java.util.HashSet;
import java.util.Set;

/**
 * Represents the maze, containing all the rooms.
 */
public class Maze {
    private Set<Room> rooms = new HashSet<Room>();

    /**
     * Constructs a new Maze object.
     */
    public Maze() {
        System.out.println("Creating a Maze");
    }

    /**
     * Adds a room to the maze if it is not already present.
     *
     * @param r The room to be added to the maze.
     */
    public void addRoom(Room r) {
        if (!rooms.contains(r)) {
            rooms.add(r);
            System.out.println("Adding " + r + " to the maze");
        }
    }
}
