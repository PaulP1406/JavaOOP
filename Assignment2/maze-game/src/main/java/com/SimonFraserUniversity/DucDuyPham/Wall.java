package com.SimonFraserUniversity.DucDuyPham;

/**
 * Represents a wall in the maze. Walls are obstacles that players cannot pass
 * through.
 */
public class Wall extends MapSite {
    private int wallNum;
    private static int wallCount = 1;

    /**
     * Constructs a Wall and assigns it a unique identifier.
     */
    public Wall() {
        wallNum = wallCount++;
        System.out.println("creating Wall #" + wallNum);
    }

    @Override
    public String toString() {
        return "Wall #" + wallNum;
    }

    /**
     * Print a message to represent the action of encountering a wall. This method
     * overrides the enter method in MapSite
     * The message tells that the wall has been hit.
     */
    @Override
    public void enter() {
        System.out.println("You just hit a wall.");
    }
}
