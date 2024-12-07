// Name: Lucy Finnerty
// Date: 12/5/24
// Purpose: This class demos the run method from the runner interface, which is implemented
// by Athlete. Machine, and PoliticalCandidate.
public class DemoRunner {
    public static void main(String[] args) {
        // create new Machine, Athlete, and PoliticalCandidate objects
        Runner machine = new Machine();
        Runner athlete = new Athlete();
        Runner politicalCandidate = new PoliticalCandidate();
        // call run method on all objects
        machine.run();
        athlete.run();
        politicalCandidate.run();
    }
}