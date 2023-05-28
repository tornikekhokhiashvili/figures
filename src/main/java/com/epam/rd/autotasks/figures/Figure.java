package com.epam.rd.autotasks.figures;

import java.util.Arrays;

abstract class Figure{

    public abstract double area();

    public abstract String pointsToString();

    public abstract String toString();

    public  Point leftmostPoint(){
        Point[] points = getPoints();
        Arrays.sort(points, (p1, p2) -> Double.compare(p1.getX(), p2.getX()));
        return points[0];
    };
     abstract Point[] getPoints();

}
