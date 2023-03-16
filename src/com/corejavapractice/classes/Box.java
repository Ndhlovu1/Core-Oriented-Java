package com.corejavapractice.classes;

public class Box {


    //Declare Class variables

    public double length, width,height;

    //Empty constructor declaration
    public Box() {
    }

    //3 Argument/Parameter Constructor Declaration
    public Box(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getVolume(double length, double width, double height){
        double vol = length * width * height;
        return vol;
    }

    public double getSurfaceArea(double length, double width, double height){
        double surfaceArea = length * width + length * height + width * height;
        return surfaceArea;
    }

    public void printBox(){
        setHeight(10.0);
        setLength(7.0);
        setWidth(14.0);
        System.out.println(getHeight() + " : Height");
        System.out.println(getLength() + " : Length");
        System.out.println(getWidth() + " : Width");
        System.out.println(getSurfaceArea(length,width, height) + " : Surface Area");
        System.out.println(getVolume(length,width, height) + " : Volume");
    }





}
