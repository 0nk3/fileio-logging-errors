public class Main {
    public static void main(String[] args) {
        //TODO : test code should come here
        //Example
        Visitor alice = new Visitor(
                "Alice Cooper",
                34 ,
                "12 Dec 2020",
                "13:00 PM",
                "Minimum Requirements Not Met",
                "Steve Jonson"
        );

        // Save : IT save the data passes whne creating an object
        alice.save();

        // load data : load a file containing data of a given visitor
        alice.load("Alice Cooper");
    }
}
