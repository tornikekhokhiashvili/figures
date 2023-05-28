package com.epam.rd.autotasks.figures;

import java.util.Arrays;
import java.util.Comparator;

abstract class Figure{

    public abstract double area();

    public abstract String pointsToString();

    public  String toString(){
        return getClass().getSimpleName() + "[" + pointsToString() + "]";
    };

    public abstract Point leftmostPoint();


}
