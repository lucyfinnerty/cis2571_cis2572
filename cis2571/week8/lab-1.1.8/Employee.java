// Name: Lucy Finnerty
// Date: 10/7/24
// Purpose: This class is for creating Employee objects. It contains three different constructors for use,
// as well as accessor and mutator methods to retrieve Employee details or set them to something new.
public class Employee {
    
    private String name; // holds employee's name
    private int idNumber; // employee's id number
    private String department; // the department employee works in
    private String position; // employee's work position within department

    // constructor with 4 parameters - name, id number, department, position
    public Employee(String name, int idNumber, String department, String position) {
        this.name = name;
        this.idNumber = idNumber;
        this.department = department;
        this.position = position;
    }
    // contructor with 2 parameters -- name and id number
    public Employee(String name, int idNumber) {
        this.name = name;
        this.idNumber = idNumber;
        this.department = ""; // set to empty string
        this.position = ""; // set to empty string
    }
    // constructor with no args -- string variables are empty and id number is set to 0
    public Employee() {
        this.name = "";
        this.idNumber = 0;
        this.department = "";
        this.position = "";
    }
    /*
     * method that accepts a string to set to 'name' variable
     */
    public void setName(String name) {
        this.name = name;
    }
    /*
     * method that returns 'name' variable
     */
    public String getName() {
        return name;
    }
    /*
     * method that accepts an int to set to 'idNumber' variable
     */
    public void setIdNumber(int idNumber) {
        this.idNumber = idNumber;
    }
    /*
     * method that returns 'idNumber' variable
     */
    public int getIdNumber() {
        return idNumber;
    }
    /*
     * method that accepts a string to set to 'department' variable
     */
    public void setDepartment(String department) {
        this.department = department;
    }
    /*
     * method that returns 'department' variable
     */
    public String getDepartment() {
        return department;
    }
    /*
     * method that accepts a string to set to 'position' variable
     */
    public void setPosition(String position) {
        this.position = position;
    }
    /*
     * method that returns 'position' variable
     */
    public String getPosition() {
        return position;
    }
}
