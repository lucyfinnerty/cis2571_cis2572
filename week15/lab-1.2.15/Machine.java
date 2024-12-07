// Name: Lucy Finnerty
// Date: 12/5/24
// Purpose: This class implements the Runner interface. It represents a machine 
// performing tasks, defined through its implementation of "run".
public class Machine implements Runner{
    /**
     * Displays a message describing that a machine is currently running.
     */
    @Override
    public void run() {
        System.out.println("Machine is running."); // display to console
    }
}