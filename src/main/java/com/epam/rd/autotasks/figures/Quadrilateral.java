package com.epam.rd.autotasks.figures;

class Quadrilateral extends Figure {
    private Point a;
    private Point b;
    private Point c;
    private Point d;
    public Quadrilateral(Point a, Point b, Point c, Point d){
        this.a=a;
        this.b=b;
        this.c=c;
        this.d=d;
    }

    @Override
    public double area() {
        Triangle triangle1=new Triangle(a,b,c);
        Triangle triangle2=new Triangle(a,c,d);
        return triangle1.area()+ triangle2.area();
    }

    @Override
    public String pointsToString() {
        return String.valueOf(a)+String.valueOf(b)+String.valueOf(c)+String.valueOf(d);

    }

    @Override
    public Point leftmostPoint() {
        if (a.getX() <= b.getX() && a.getX() <= c.getX() && a.getX() <= d.getX()) {
            return a;
        } else if (b.getX() <= c.getX() && b.getX() <= d.getX()) {
            return b;
        } else if (c.getX() <= d.getX()) {
            return c;
        } else {
            return d;
        }
    }

    @Override
    public String toString() {
       return "Quadrilateral"+"[" + pointsToString() + "]";
    }
}
