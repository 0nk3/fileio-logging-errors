import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //TODO : test code should come here
        Scanner inputReader = new Scanner(System.in);


        System.out.println("Enter Student Full Name : ");
        String fullname = inputReader.nextLine();

        System.out.println("How old is the student : ");
        String age = inputReader.nextLine();

        System.out.println("What is your name (Assistant) : ");
        String assistant = inputReader.nextLine();

        System.out.println("Comments : ");
        String comments = inputReader.nextLine();

        Visitor visitor = new Visitor(
                fullname,
                age ,
                comments,
                assistant
        );

        // Save : IT save the data passes when creating an object
        visitor.save();

        // load data : load a file containing data of a given visitor
        visitor.load(fullname);
    }
}
