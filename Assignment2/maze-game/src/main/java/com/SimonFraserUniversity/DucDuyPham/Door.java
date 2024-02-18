package com.SimonFraserUniversity.DucDuyPham;

/**
 * Abstract product 
 * The Door class represents a door in the maze to connects two rooms.
 */
public class Door extends MapSite {
    protected Room room1;
    protected Room room2;
    protected int doorNum;
    protected static int doorCount = 1;
    protected boolean isOpen;

    /**
     * Creates a door, assign a number to it, increment the number of doors created
     * so far in the map and connect two different rooms
     *
     * @param room1 The first room connected by the door.
     * @param room2 The second room connected by the door.
     */
    public Door(Room room1, Room room2) {
        doorNum = doorCount++;
        System.out.println("creating a " + this.toString() + " between " + room1
                + " and " + room2);
        this.room1 = room1;
        this.room2 = room2;
        this.isOpen = false;
    }

    /**
     * Prints out a message to represent the enter method.
     * If the door is open, we can go through the door, else it is closed and can't
     * enter
     */
    @Override
    public void enter() {
        if (isOpen) {
            System.out.println("Passing through the door to another room.");
        } else {
            System.out.println("The door is closed.");
        }
    }

    /**
     * Provide a string representation of the door element, with the door number
     *
     * @return A string that represents the door number.
     */
    @Override
    public String toString() {
        return "Door #" + doorNum;
    }

    /**
     * Prints out a message to represent to open door method, allowing entrance to
     * the room using enter method if the room was previously locked
     */
    public void open() {
        isOpen = true;
        System.out.println("Opening the " + this.toString());
    }
}
