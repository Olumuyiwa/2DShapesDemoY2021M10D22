package com.techniche.shapes;

public class Circle extends Shape2DParentClass implements ShapeInterface {


    @Override
    public double calculateArea() {
        return 3.142 * Math.pow(getRadius(), 2.0);
    }

    @Override
    public double calculatePerimeter() {
        return 3.142 * 2.0 * getRadius();
    }
}
