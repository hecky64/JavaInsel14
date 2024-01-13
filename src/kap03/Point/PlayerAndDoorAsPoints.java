package kap03.Point;

import java.awt.Point;

public class PlayerAndDoorAsPoints {
    public static void main(String[] args){
        MyPoint player = new MyPoint(new Point(10,10));
        MyPoint door = new MyPoint(new Point(10,100));

        System.out.println("Entfernung player-door: " + player.distance(door));
        System.out.println("Position player : " + player);
        System.out.println("Position door   : " + door);
    }
}
