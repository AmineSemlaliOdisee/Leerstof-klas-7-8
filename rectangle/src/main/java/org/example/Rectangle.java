package org.example;

public class Rectangle {

    private double length;
    private double width;
    private double area;

    private void calcArea() {
        area = length * width;
    }

    public Rectangle(final double length, final double width){
        this.width = width;
        this.length = length;
        calcArea();
    }

    public double getArea(){
        return area;
    }

    public void setLength(double length) {
        this.length = length;
        calcArea();
    }

    public void setWidth(double width) {
        this.width = width;
        calcArea();
    }
}
