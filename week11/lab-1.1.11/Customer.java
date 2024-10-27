
public class Customer extends Person {
    private int customerNum;
    private boolean mailingList=false;

    /**
     * no-args Customer constructor
     */
    public Customer(){}
    /**
     * 2-args Customer constructor
     * @param customerNum
     * @param mailingList
     */
    public Customer(int customerNum, boolean mailingList){
        this.customerNum = customerNum;
        this.mailingList = mailingList;
    }
    /**
     * 5-args Customer constructor
     * @param name
     * @param address
     * @param cellNum
     * @param customerNum
     * @param mailingList
     */
    public Customer(String name, String address, String cellNum, int customerNum, boolean mailingList) {
        super(name, address, cellNum);
        this.customerNum = customerNum;
        this.mailingList = mailingList;
    }
    public int getCustomerNum() {
        return customerNum;
    }
    public void setCustomerNum(int customerNum) {
        this.customerNum = customerNum;
    }
    public boolean getMailingList() {
        return mailingList;
    }
    public void setMailingList(boolean mailingList) {
        this.mailingList = mailingList;
    }
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
