package com.techniche;

import com.techniche.shapes.Circle;
import com.techniche.shapes.Rectangle;

public class Main {

    public static void main(String[] args) {
        System.out.println("This is just a test");
//		Circle newCircle1 = (Circle) new Shape2DParentClass();
//
//		newCircle1.setRadius(10);
//		double areaOfNewCircle1 = newCircle1.calculateArea();
//		double perimeterOfNewCircle1 = newCircle1.calculatePerimeter();
//
//		System.out.println("RadiusOfNewCircle1 = " + newCircle1.getRadius());
//		System.out.println("areaOfNewCircle1 = " + areaOfNewCircle1);
//		System.out.println("perimeterOfNewCircle1 = " + perimeterOfNewCircle1);

        Circle specialCircle1 = new Circle();
        specialCircle1.setRadius(15);
        double areaOfSpecialCircle1 = specialCircle1.calculateArea();
        double perimeterOfSpecialCircle1 = specialCircle1.calculatePerimeter();

        System.out.println("RadiusOfspecialCircle1 = " + specialCircle1.getRadius());
        System.out.println("areaOfSpecialCircle1 = " + areaOfSpecialCircle1);
        System.out.println("perimeterOfSpecialCircle1 = " + perimeterOfSpecialCircle1);

        Rectangle rectangle1 = new Rectangle();
        rectangle1.setLength(10);
        rectangle1.setBreadth(20);
        double area = rectangle1.calculateArea();
        double perimeter = rectangle1.calculatePerimeter();

        System.out.println("Length of the rectangle  = " + rectangle1.getLength());
        System.out.println("Breadth of the rectangle  = " + rectangle1.getBreadth());
        System.out.println("area = " + area);
        System.out.println("perimeter = " + perimeter);


    }
}
