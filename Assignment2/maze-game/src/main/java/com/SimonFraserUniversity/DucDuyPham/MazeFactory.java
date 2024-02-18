package com.SimonFraserUniversity.DucDuyPham;

public class MazeFactory {
    public MazeFactory() {
    }

    public Maze makeMaze() {
        return new Maze();
    }

    public Room makeRoom() {
        return new Room();
    }

    public Wall makeWall() {
        return new Wall();
    }

    public Door makeDoor(Room room1, Room room2) {
        return new Door(room1, room2);
    }
}
