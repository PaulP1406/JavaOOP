package com.SimonFraserUniversity.DucDuyPham;

public class MazeGame {
    public Maze createMaze(MazeFactory factory) {
        Maze maze = factory.makeMaze();
        Room room1 = factory.makeRoom();
        Room room2 = factory.makeRoom();
        Door door = factory.makeDoor(room1, room2);

        maze.addRoom(room1);
        maze.addRoom(room2);

        // Template maze
        room1.setSide(Direction.North, new Wall());
        room1.setSide(Direction.East, new Wall());
        room1.setSide(Direction.South, new Wall());
        room1.setSide(Direction.West, door);
        room2.setSide(Direction.North, door);
        room2.setSide(Direction.East, new Wall());
        room2.setSide(Direction.South, new Wall());
        room2.setSide(Direction.West, new Wall());

        return maze;
    }
}
