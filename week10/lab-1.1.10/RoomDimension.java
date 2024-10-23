
public class RoomDimension {
    private int length=0;
    private int width=0;

    public RoomDimension(int l, int w) {
        this.length = l;
        this.width = w;
    }
    public int getLength() {
        return length;
    }
    public void setLength(int l) {
        this.length = l;
    }
    public int getWidth() {
        return width;
    }
    public void setWidth(int w) {
        this.width = w;
    }
    public int getArea() {
        return length * width;
    }
}
