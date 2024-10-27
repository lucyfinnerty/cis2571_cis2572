
public class CustomerDemo {
    public static void main(String[] args) {
        // a new Customer object using the 5-args constructor
        Customer customer1 = new Customer("John Doe", "123 Main St, Chicago, IL.", "123-4567-890", 101, true);
        // display the customer information using toString method
        System.out.println(customer1 +"\n");

        // another new Customer object using the no-args constructor
        Customer customer2 = new Customer();
        customer2.setName("Jane Smith");
        customer2.setAddress("456 Elm St, Glen Ellyn, IL.");
        customer2.setCellNum("098-7654-321");
        customer2.setCustomerNum(102);
        customer2.setMailingList(false);
        // display the second customer's information using toString method
        System.out.println(customer2);
    }
}
