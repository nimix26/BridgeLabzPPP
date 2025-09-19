package BridgeLabzPPP.constructor;

public class Circle {
    double radius;

   
    Circle() {
        this(1.0); 
    }

    
    Circle(double radius) {
        this.radius = radius;
    }

    void displayCircle() {
        System.out.println("Radius: " + radius);
    }
}
