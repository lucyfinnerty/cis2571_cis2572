
public class Person {
    private String name;
    private String address;
    private String cellNum;

    /**
     * no-args Person constructor
     */
    public Person() {}
    /**
     * 3-args Person Constructor
     * @param name
     * @param address
     * @param cellNum
     */
    public Person(String name, String address, String cellNum) {
        this.name = name;
        this.address = address;
        this.cellNum = cellNum;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public String getCellNum() {
        return cellNum;
    }
    public void setCellNum(String cellNum) {
        this.cellNum = cellNum;
    }
    @Override
    public String toString() {
        return "Person" +
                "\nName: " + name +
                "\nAddress: " + address +
                "\nCellNum: " + cellNum;
    }
}
