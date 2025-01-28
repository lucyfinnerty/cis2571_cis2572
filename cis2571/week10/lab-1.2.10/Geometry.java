// Name: Lucy Finnerty
// Date: 10/24/24
// Purpose: This class calculates the area of circles, triangles, and rectangles.
public class Geometry {
    /**
     * method that calculates and returns area of a circle given its radius
     * @param radius length from midpoint to end of circle
     * @return area of circle
     */
    public double circleArea(double radius) {
        return Math.PI*radius*radius;
    }
    /**
     * method that calculates and returns area of a triangle given its base length and height
     * @param base length of base
     * @param height height of triangle
     * @return area of triangle
     */
    public double triangleArea(double base, double height) {
        return base*height*0.5;
    }
    /**
     * method that calculates and returns area of a rectangle given its length and width
     * @param length length of rectangle
     * @param width width of rectangle
     * @return area of rectangle
     */
    public double rectangleArea(double length, double width) {
        return length*width;
    }
}