package com.company;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class rectangleArea {
    float length;
    float width;
    float area;

    void getData( ) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the length in cm");
        float length= Float.parseFloat(br.readLine());

        System.out.println("Enter the width in cm");
        float width= Float.parseFloat(br.readLine());

    }

    float computeField(){
        return area=length*width;
    }
    void fieldDisplay(){
        System.out.println("The length is " + length + " and width is " + width + " .The area is " + area);
    }
}
class rectangle{
    public static void main(String[] args)  {
        rectangleArea shape = new rectangleArea();

        System.out.println("Area = " + shape.computeField());
        shape.fieldDisplay();
    }
}