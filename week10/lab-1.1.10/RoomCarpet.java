// Name: Lucy Finnerty
// Date: 10/23/24
// Purpose: This class allows for a RoomCarpet object to be made and calculates the total cost per sq ft of the carpet.
public class RoomCarpet {
    private double cost=0.0; // cost per sq ft of carpet
    private RoomDimension dimension; // the dimensions of the room
    /**
     * constructor with 2 parameters for RoomCarpet object
     * @param cost cost per sq ft of carpet
     * @param dimension area of the room
     */
    public RoomCarpet(double cost, RoomDimension dimension) {
        this.cost = cost;
        this.dimension = dimension;
    }
    /**
     * accessor method for cost variable
     * @return cost per sq ft of carpet
     */
    public double getCost() {
        return cost;
    }
    /**
     * mutator method for cost variable
     * @param cost cost per sq ft of carpet
     */
    public void setCost(double cost) {
        this.cost = cost;
    }
    /**
     * accessor method for dimension object
     * @return dimension of room
     */
    public RoomDimension getDimension(){
        return dimension;
    }
    /**
     * mutator method for dimension object
     * @param dimension dimensions of room
     */
    public void setDimension(RoomDimension dimension) {
        this.dimension = dimension;
    }
    /**
     * calculates total cost to carpet room
     * @return total cost
     */
    public double costPerSqFt() {
        return dimension.getArea() * cost;
        }
    }