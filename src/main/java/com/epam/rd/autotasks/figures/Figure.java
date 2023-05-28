package com.epam.rd.autotasks.figures;

abstract class Figure{

    public abstract double area();

    public abstract String pointsToString();

    public String toString() {
        return this.getClass().getSimpleName() + "[" + pointsToString() + "]";
    }

    public  Point leftmostPoint(){
        Point leftmost = null;
        double minX = Double.MAX_VALUE;

        Point[] points = getPoints();
        for (Point point : points) {
            if (point.getX() < minX) {
                minX = point.getX();
                leftmost = point;
            }
        }

        return leftmost;
    };
     abstract Point[] getPoints();

}
