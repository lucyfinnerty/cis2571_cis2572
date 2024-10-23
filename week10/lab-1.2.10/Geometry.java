
public class Geometry {
    public double circleArea(double radius) {
        return Math.PI*radius*radius;
    }
    public double triangleArea(double base, double height) {
        return base*height*0.5;
    }
    public double rectangleArea(double length, double width) {
        return length*width;
    }
}