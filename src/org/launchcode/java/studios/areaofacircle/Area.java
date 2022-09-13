package org.launchcode.java.studios.areaofacircle;
import java.util.Scanner;

import static org.launchcode.java.studios.areaofacircle.Circle.getArea;

public class Area {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double userRadius;
        double areaCircle;


        System.out.println("Enter a radius: ");
        userRadius = input.nextFloat();
        input.close();

        areaCircle = getArea(userRadius);


        System.out.println("The area of a circle of radius " + userRadius + " is: " + areaCircle);

    }
}
