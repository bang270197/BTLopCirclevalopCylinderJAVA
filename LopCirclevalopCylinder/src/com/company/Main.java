package com.company;

public class Main {

    public static void main(String[] args) {
	Circle circle=new Circle(3.8,"Red");
        System.out.println(circle.toString());	
        Cylinder cylinder=new Cylinder(2.5,"blue",3.5);
        System.out.println(cylinder.toString());
    }
}
