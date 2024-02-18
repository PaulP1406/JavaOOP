package com.SimonFraserUniversity.DucDuyPham;

/**
 * The main class for the maze game application.
 * This class is responsible for initializing the game with a maze factory and
 * starting the game.
 */
public class App {
    /**
     * The entry point of the application.
     * <p>
     * There are two test cases for the maze program.
     * The first test case initializes the maze game by creating a
     * {@link MazeFactory},
     * which is used to generate a maze. It demonstrates the creation of a maze
     * using the normal stardard {@link MazeFactory}
     * 
     * The second test case initializes the maze game by creating a
     * {@link EnchantedMazeFactory},
     * which is used to generate a maze. It demonstrates the creation of a maze
     * using the normal stardard {@link EnchantedMazeFactory}
     * </p>
     * 
     * @param args Command-line arguments (not used).
     */
    public static void main(String[] args) {
        MazeFactory factory = new MazeFactory();
        MazeGame game = new MazeGame();
        game.createMaze(factory);

        EnchantedMazeFactory factory2 = new EnchantedMazeFactory();
        MazeGame game2 = new MazeGame();
        game2.createMaze(factory2);

    }
}
