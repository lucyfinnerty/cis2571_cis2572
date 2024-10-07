// Name: Lucy Finnerty
// Date: 10/7/24
// Purpose: This class demos all three constructors and displays them. The first one requires all 4 parameters, the second requires 2,
// and the third does not require any.
public class EmployeeDemo {
    public static void main(String[] args) {
        // 3 Employee objects using all three different constructors
        // constructor 1
        Employee one = new Employee("Susan Meyers", 47899, "Accounting", "Vice President");
        // constructor 2
        Employee two = new Employee("Mark Jones", 39119);
        two.setDepartment("IT");
        two.setPosition("Programmer");
        //constructor 3
        Employee three = new Employee();
        three.setName("Joy Rogers");
        three.setIdNumber(81774);
        three.setDepartment("Manufacturing");
        three.setPosition("Engineer");

        // displays all 3 employees
        System.out.println("    Name         ID       Department       Position");
        System.out.println("----------------------------------------------------------");
        System.out.println(one.getName() + "    " + one.getIdNumber() + "     " + one.getDepartment() + "       " + one.getPosition());
        System.out.println(two.getName() + "      " + two.getIdNumber() + "     " + two.getDepartment() + "               " + two.getPosition());
        System.out.println(three.getName() + "      " + three.getIdNumber() + "     " + three.getDepartment() + "    " + three.getPosition());
    }
}
