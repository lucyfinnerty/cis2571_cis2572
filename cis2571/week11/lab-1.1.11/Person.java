// Name: lucy Finnerty
// Date: 10/28/24
// Purpose: This class allows for Person object to be made using either 2 constructors.
// A Person has 3 variables - name, address, and cell number. The class also provides
// accessor and mutator methods.
public class Person {
    
    private String name; // name of Person object
    private String address; // address of Person object
    private String cellNum; // cellphone number of Person object

    /**
     * no-args Person constructor
     */
    public Person() {}
    /**
     * 3-args Person Constructor
     * @param name name of Person object
     * @param address address of Person object
     * @param cellNum cellphone number of Person object
     */
    public Person(String name, String address, String cellNum) {
        this.name = name;
        this.address = address;
        this.cellNum = cellNum;
    }
    
    /**
     * accessor method for name variable
     * @return name
     */
    public String getName() {
        return name;
    }
    /**
     * mutator method for name variable
     * @param name name of Person object
     */
    public void setName(String name) {
        this.name = name;
    }
    /**
     * accessor method for address variable
     * @return address
     */
    public String getAddress() {
        return address;
    }
    /**
     * mutator method for address variable
     * @param address address of Person object
     */
    public void setAddress(String address) {
        this.address = address;
    }
    /**
     * accessor method for cellNum variable
     * @return cellNum
     */
    public String getCellNum() {
        return cellNum;
    }
    /**
     * mutator method for cellNum variable
     * @param cellNum cellphone number of Person object
     */
    public void setCellNum(String cellNum) {
        this.cellNum = cellNum;
    }
    /**
     * This method will print a summary of a Person object
     */
    @Override
    public String toString() {
        return "Person" +
                "\nName: " + name +
                "\nAddress: " + address +
                "\nCellNum: " + cellNum;
    }
}