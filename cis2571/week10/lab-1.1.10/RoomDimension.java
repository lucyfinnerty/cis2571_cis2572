// Name: Lucy Finnerty
// Date: 10/23/24
// Purpose: This class allows for a RoomDimension object to be made and calculates the area of a room given length and width.
public class RoomDimension {
    private int length=0; // length of room
    private int width=0; // width of room
    /**
     * constructor with 2 parameters for RoomDimension object
     * @param l length of room
     * @param w width of room
     */
    public RoomDimension(int l, int w) {
        this.length = l;
        this.width = w;
    }
    /**
     * accessor method for length variable
     * @return length of room
     */
    public int getLength() {
        return length;
    }
    /**
     * mutator method for length variable
     * @param l length of room to set
     */
    public void setLength(int l) {
        this.length = l;
    }
    /**
     * accessor method for width variable
     * @return width of room
     */
    public int getWidth() {
        return width;
    }
    /**
     * mutator method for width variable
     * @param w width of room to set
     */
    public void setWidth(int w) {
        this.width = w;
    }
    /**
     * calculates area of room from given length and width
     * @return area
     */
    public int getArea() {
        return length * width;
    }
}