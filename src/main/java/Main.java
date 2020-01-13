public class Main {
    public static void main(String[] args) {
        //TODO : test code should come here
        //Example
        Visitor alice = new Visitor("Alice Cooper", 34 , "12 Dec 2020", "13:00 PM", "Minimum Requirements Not Met", "Steve Jonson");
        // Save
        alice.save();
        // load data
        alice.load("Alice Cooper");
    }
}
