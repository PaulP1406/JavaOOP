package com.SimonFraserUniversity.DucDuyPham;

public class Room extends MapSite {
    protected int roomNum;
    protected static int roomCount = 1;
    protected MapSite northSide;
    protected MapSite southSide;
    protected MapSite eastSide;
    protected MapSite westSide;

    public Room() {
        this.roomNum = roomCount++;
        System.out.println("Creating " + this.toString());
    }

    public void setSide(Direction direction, MapSite site) {
        switch (direction) {
            case North:
                northSide = site;
                break; // Fixed: Added break statements
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

    public int getRoomNum() {
        return this.roomNum;
    }

    @Override
    public void enter() {
        System.out.println("Entering room " + roomNum);
    }

    @Override
    public String toString() {
        return "Room #" + roomNum;
    }
}
