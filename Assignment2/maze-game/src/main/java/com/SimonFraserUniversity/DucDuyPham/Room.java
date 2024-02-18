package com.SimonFraserUniversity.DucDuyPham;

/**
 * Represents a room in the maze. Each room has four sides that can be either a
 * wall or a door.
 */
public class Room extends MapSite {
    protected int roomNum;
    protected static int roomCount = 1;
    protected MapSite northSide;
    protected MapSite southSide;
    protected MapSite eastSide;
    protected MapSite westSide;

    /**
     * Create a Room and assigns a room number to it.
     */
    public Room() {
        this.roomNum = roomCount++;
        System.out.println("Creating " + this.toString());
    }

    /**
     * Sets one of the sides of the room to the specified MapSite.
     *
     * @param direction The direction of the side of the room being set (North,
     *                  South, East, West).
     * @param site      The MapSite element to modify a side in a certain direction
     */
    public void setSide(Direction direction, MapSite site) {
        switch (direction) {
            case North:
                northSide = site;
                break;
            case South:
                southSide = site;
                break;
            case East:
                eastSide = site;
                break;
            case West:
                westSide = site;
                break;
        }
        System.out.println("Setting " + direction + " side of " + this.toString() + " to " + site);
    }

    /**
     * Getter method for returning the room number of the room
     *
     * @return The room number assigned to this room.
     */
    public int getRoomNum() {
        return this.roomNum;
    }

    /**
     * Priting a message to describe the method entering the room
     */
    @Override
    public void enter() {
        System.out.println("Entering room " + roomNum);
    }

    /**
     * Returns a string representation of the room element, with the room number
     * 
     * @return A string that represents the room number.
     */
    @Override
    public String toString() {
        return "Room #" + roomNum;
    }
}
