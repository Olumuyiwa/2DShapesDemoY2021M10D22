package com.techniche.shapes;

public class Rectangle extends Shape2DParentClass implements ShapeInterface {


    @Override
    public double calculateArea() {
        return super.breadth * super.length;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * (super.breadth + super.length);
    }
}
