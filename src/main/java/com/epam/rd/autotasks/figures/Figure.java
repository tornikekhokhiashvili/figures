package com.epam.rd.autotasks.figures;

abstract class Figure{

    public abstract double area();

    public abstract String pointsToString();

    public String toString() {
        return this.getClass().getSimpleName() + "[" + pointsToString() + "]";
    }

    public  Point leftmostPoint(){
        Point[] points = getPoints();
        Point leftmost = points[0];

        for (int i = 1; i < points.length; i++) {
            if (points[i].getX() < leftmost.getX()) {
                leftmost = points[i];
            }
        }

        return leftmost;
    };
     abstract Point[] getPoints();

}
