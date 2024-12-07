// Name: Lucy Finnerty
// Date: 12/5/24
// Purpose: Athlete class implements the Runner interface. It represents an athlete physically running.
public class Athlete implements Runner {
    /**
     * Displays a message describing that an athlete is currently running.
     */
    @Override
    public void run() {
        System.out.println("Athlete is running."); // display to console
    }
}