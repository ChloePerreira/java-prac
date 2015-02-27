package com.perreira.crystal;

/**
 * Created by crystal on 2/25/15.
 */
public class Point {
    private int x;
    private int y;

    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }

    public int getX() { //this is typical style for a getter
        return x;
    }

    public int getY() {
        return y;
    }

    public int distanceSquaredToOrigin(){
        return (x*x) + (y*y);
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
