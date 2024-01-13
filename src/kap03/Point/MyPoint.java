package kap03.Point;

import java.awt.Point;

public class MyPoint extends Point {
    public MyPoint(Point p){
        super(p);
    }

    @Override
    public String toString(){
        return ("[x = " + this.getX() + ", y = " + this.getY() + "]");
    }
}
