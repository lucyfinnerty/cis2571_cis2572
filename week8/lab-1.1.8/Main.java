
public class Main {
    public static void main(String[] args) {
        // create 3 Employee objects
        Employee one = new Employee("Susan Meyers", 47899, "Accounting", "Vice President");
        Employee two = new Employee("Mark Jones", 39119);
        two.setDepartment("IT");
        two.setPosition("Programmer");
        Employee three = new Employee();
        three.setName("Joy Rogers");
        three.setIdNumber(81774);
        three.setDepartment("Manufacturing");
        three.setPosition("Engineer");

        System.out.println("    Name         ID       Department       Position");
        System.out.println("----------------------------------------------------------");
        System.out.println(one.getName() + "    " + one.getIdNumber() + "     " + one.getDepartment() + "       " + one.getPosition());
        System.out.println(two.getName() + "      " + two.getIdNumber() + "     " + two.getDepartment() + "               " + two.getPosition());
        System.out.println(three.getName() + "      " + three.getIdNumber() + "     " + three.getDepartment() + "    " + three.getPosition());
    }
}
