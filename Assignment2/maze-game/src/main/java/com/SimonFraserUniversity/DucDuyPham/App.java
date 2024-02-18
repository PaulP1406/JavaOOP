package com.SimonFraserUniversity.DucDuyPham;

public class App {
    public static void main(String[] args) {
         MazeFactory factory = new MazeFactory();
         MazeGame game = new MazeGame();
         game.createMaze(factory);

        //EnchantedMazeFactory factory2 = new EnchantedMazeFactory();
        //MazeGame game2 = new MazeGame();
        //game2.createMaze(factory2);

    }
}
