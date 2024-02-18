package com.SimonFraserUniversity.DucDuyPham;

/**
 * The MazeGame class is creates and initializes the mazes with rooms, doors,
 * and walls with a template.
 */
public class MazeGame {
    /**
     * Creates a maze using the specified factory, can be either normal or
     * enchanted. The method sets up the maze with two rooms and a door between them.
     * Each room is surrounded by walls on all sides except for the side with the
     * door.
     *
     * @param factory The MazeFactory used to create the maze components.
     * @return The fully initialized maze.
     */
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
