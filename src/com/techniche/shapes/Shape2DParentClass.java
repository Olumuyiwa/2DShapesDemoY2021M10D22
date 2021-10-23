package com.techniche.shapes;

public class Shape2DParentClass {
    protected double length;
    protected double breadth;
    protected double height;
    protected double radius;
    protected double sideCAkaBaseOfTriangle;
    protected double sideA;
    protected double sideB;

    public Shape2DParentClass() {

    }

    public Shape2DParentClass(double length, double breadth, double height, double radius, double sideCAkaBaseOfTriangle, double sideA, double sideB) {
        this.length = length;
        this.breadth = breadth;
        this.height = height;
        this.radius = radius;
        this.sideCAkaBaseOfTriangle = sideCAkaBaseOfTriangle;
        this.sideA = sideA;
        this.sideB = sideB;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getBreadth() {
        return breadth;
    }

    public void setBreadth(double breadth) {
        this.breadth = breadth;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getSideCAkaBaseOfTriangle() {
        return sideCAkaBaseOfTriangle;
    }

    public void setSideCAkaBaseOfTriangle(double sideCAkaBaseOfTriangle) {
        this.sideCAkaBaseOfTriangle = sideCAkaBaseOfTriangle;
    }

    public double getSideA() {
        return sideA;
    }

    public void setSideA(double sideA) {
        this.sideA = sideA;
    }

    public double getSideB() {
        return sideB;
    }

    public void setSideB(double sideB) {
        this.sideB = sideB;
    }

    @Override
    public String toString() {
        return "Shape2DParentClass{" +
                "length=" + length +
                ", breadth=" + breadth +
                ", height=" + height +
                ", radius=" + radius +
                ", sideCAkaBaseOfTriangle=" + sideCAkaBaseOfTriangle +
                ", sideA=" + sideA +
                ", sideB=" + sideB +
                '}';
    }
}
