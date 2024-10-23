
public class RoomCarpet {
    private double cost=0.0;
    private RoomDimension dimension;

    public RoomCarpet(double cost, RoomDimension dimension) {
        this.cost = cost;
        this.dimension = dimension;
    }
    public double getCost() {
        return cost;
    }
    public void setCost(double cost) {
        this.cost = cost;
    }
    public RoomDimension getDimension(){
        return dimension;
    }
    public void setDimension(RoomDimension dimension) {
        this.dimension = dimension;
    }
    public double costPerSqFt() {
        return dimension.getArea() * cost;
        }
    }