package com.SimonFraserUniversity.DucDuyPham;

import java.util.HashSet;
import java.util.Set;

public class Maze {
    private Set<Room> rooms = new HashSet<Room>();

    public Maze() {
        System.out.println("Creating a Maze");
    }

    public void addRoom(Room r) {
        if (!rooms.contains(r)) {
            rooms.add(r);
            System.out.println("Adding " + r + " to the maze");
        }
    }
}
