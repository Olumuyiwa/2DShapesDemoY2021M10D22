package com.techniche.shapes;

public class Triangle extends Shape2DParentClass implements ShapeInterface {


    @Override
    public double calculateArea() {
        return (0.5) * (super.sideCAkaBaseOfTriangle * super.height);
    }

    @Override
    public double calculatePerimeter() {
        return 2 * (super.breadth + super.length);
    }
}
