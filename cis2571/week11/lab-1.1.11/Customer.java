// Name: Lucy Finnerty
// Date: 10/28/24
// Purpose: This class allows for a Customer object to be made, which is a sublass/extension
// of Person class. It has the same utilities as the Person class as well as 2 other
// variables - customer number and mailing list; and more accessor/ mutator methods.
public class Customer extends Person {
    
    private int customerNum; // number assigned to customer
    private boolean mailingList=false; // whether or not customer is signed up for mailing list

    /**
     * no-args Customer constructor
     */
    public Customer() {}
    /**
     * 2-args Customer constructor
     * @param customerNum number assigned to customer
     * @param mailingList whether or not customer is signed up for mailing list
     */
    public Customer(int customerNum, boolean mailingList) {
        this.customerNum = customerNum;
        this.mailingList = mailingList;
    }
    /**
     * 5-args Customer constructor
     * @param name name of Person object
     * @param address address of Person object
     * @param cellNum cellphone number of Person object
     * @param customerNum number assigned to customer
     * @param mailingList whether or not customer is signed up for mailing list
     */
    public Customer(String name, String address, String cellNum, int customerNum, boolean mailingList) {
        super(name, address, cellNum);
        this.customerNum = customerNum;
        this.mailingList = mailingList;
    }
    
    /**
     * accessor method for customerNum variable
     * @return customerNum
     */
    public int getCustomerNum() {
        return customerNum;
    }
    /**
     * mutator method for customerNum variable
     * @param customerNum number assigned to customer
     */
    public void setCustomerNum(int customerNum) {
        this.customerNum = customerNum;
    }
    /**
     * accessor method for mailingList variable
     * @return mailingList
     */
    public boolean getMailingList() {
        return mailingList;
    }
    /**
     * mutator method for mailingList variable
     * @param mailingList whether or not customer is signed up for mailing list
     */
    public void setMailingList(boolean mailingList) {
        this.mailingList = mailingList;
    }
    /**
     * This method will print a summary of a Customer object
     */
    @Override
    public String toString() {
        return "Customer" +
                "\nName: " + getName() +
                "\nAddress: " + getAddress() +
                "\nCellNum: " + getCellNum() +
                "\nCustomerNum: " + customerNum +
                "\nMailing List: " + mailingList;
    }
}