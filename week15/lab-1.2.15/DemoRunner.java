public class DemoRunner {
    public static void main(String[] args) {
        Runner machine = new Machine();
        Runner athlete = new Athlete();
        Runner politicalCandidate = new PoliticalCandidate();

        machine.run();
        athlete.run();
        politicalCandidate.run();
    }
}