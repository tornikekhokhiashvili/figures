package com.epam.rd.autotasks.figures;

public class Circle extends Figure {
        private Point center;
        private double radius;

        public Circle(Point center,double radius){
            this.center=center;
            this.radius=radius;
        }
    @Override
    public double area() {
        return Math.PI * radius* radius;
    }

    @Override
    public String pointsToString() {
        return String.valueOf(center);
    }

    @Override
    public Point leftmostPoint() {
        return new Point(center.getX() - radius, center.getY());
    }

    @Override
    public String toString() {
        return "Circle" + "[" + pointsToString() + radius + "]";
    }
}
