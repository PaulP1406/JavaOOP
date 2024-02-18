package com.SimonFraserUniversity.DucDuyPham;

public class Door extends MapSite {
    protected Room room1;
    protected Room room2;
    protected int doorNum;
    protected static int doorCount = 1;
    protected boolean isOpen;

    public Door(Room room1, Room room2) {
        doorNum = doorCount++;
        System.out.println("creating a " + this.toString() + " between " + room1
                + " and " + room2);
        this.room1 = room1;
        this.room2 = room2;
        this.isOpen = false;
    }

    @Override
    public void enter() {
        if (isOpen) {
            System.out.println("Passing through the door to another room.");
        } else {
            System.out.println("The door is closed.");
        }
    }

    @Override
    public String toString() {
        return "Door #" + doorNum;
    }

    public void open() {
        isOpen = true;
    }
}
