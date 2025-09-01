package labs.lab01abstractionShape;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Calculating the area of a Rectangle: ");
        System.out.print("Enter width: ");
        float w = keyboard.nextFloat();
        System.out.print("Enter height: ");
        float h = keyboard.nextFloat();
        Rectangle rct = new Rectangle(w,h);
        rct.draw();
        System.out.println("Area: " + rct.calculateArea());
        System.out.println("Calculating perimeter of the Rectangle:");
        System.out.println("Perimeter: " + rct.calculatePerimeter());
        System.out.println("Color of the Rectangle: " + rct.lineColor());

        System.out.println("Calculating the area of a Circle");
        System.out.print("Enter radius: ");
        float r = keyboard.nextFloat();
        Circle cr = new Circle(r);
        cr.draw();
        System.out.println("Area: " + cr.calculateArea());
        System.out.println("Calculating perimeter of the Circle:");
        System.out.println("Perimeter: " + cr.calculatePerimeter());
        System.out.println("Color of the Circle: " + cr.lineColor());



    }
}
