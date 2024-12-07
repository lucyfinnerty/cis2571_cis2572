// Name: Lucy Finnerty
// Date: 12/5/24
// Purpose: PoliticalCandidate class implements the Runner interface. It represents a Candidate running in an election.
public class PoliticalCandidate implements Runner{
    /**
     * Displays a message describing that a political candidate is currently running.
     */
    @Override
    public void run() {
        System.out.println("Politcal Candidate is running."); // display to console
    }
}