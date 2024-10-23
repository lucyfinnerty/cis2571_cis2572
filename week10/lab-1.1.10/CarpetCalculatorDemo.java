import javax.swing.JOptionPane;
public class CarpetCalculatorDemo {
    public static void main(String[] args) {
        String lengthInput = JOptionPane.showInputDialog("Enter the length of the room:");
        int length = Integer.parseInt(lengthInput);

        // get width input from user
        String widthInput = JOptionPane.showInputDialog("Enter the width of the room:");
        int width = Integer.parseInt(widthInput);

        // get cost per square foot input from user
        String costInput = JOptionPane.showInputDialog("Enter the cost per square foot of carpet:");
        double costPerSquareFoot = Double.parseDouble(costInput);

        // create RoomDimension object
        RoomDimension roomDimension = new RoomDimension(length, width);

        // create RoomCarpet object
        RoomCarpet roomCarpet = new RoomCarpet(costPerSquareFoot, roomDimension);

        // calculate the total cost of the carpet
        double totalCost = roomCarpet.costPerSqFt();

        // display the result to the user
        JOptionPane.showMessageDialog(null, "The total cost to carpet the room is: $" + totalCost);
    }
}
