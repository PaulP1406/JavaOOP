package com.SimonFraserUniversity.DucDuyPham;

public class Wall extends MapSite {
    private int wallNum;
    private static int wallCount = 1;

    public Wall() {
        wallNum = wallCount++;
        System.out.println("creating Wall #" + wallNum);
    }

    @Override
    public String toString() {
        return "Wall #" + wallNum;
    }

    @Override
    public void enter() {
        System.out.println("You just hit a wall.");
    }
}
