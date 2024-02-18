package com.SimonFraserUniversity.DucDuyPham;

/**
 * An abstract class that represents a component of the maze.
 * MapSite is the interface for all the components of the maze, Room, Wall, Door
 * and their concrete products EnchantedRoom and DoorNeedingSpell
 */
public abstract class MapSite {
    /**
     * Prints out a message for the action of entering a component of the maze.
     */
    public abstract void enter();

    /**
     * Provides a string representation of a maze component.
     * This method will be overridden by subclasses to provide a specific
     * description.
     *
     * @return A string that represents the maze component.
     */
    public abstract String toString();
}
