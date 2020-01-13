import java.io.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import static java.lang.System.out;

public class Visitor {

    private String fullName;
    private int age;
    private String dateOFVisit;
    private String timeOfVisit;
    private String comments;
    private String assistantName;

    private static final Logger logger = LogManager.getLogger(Visitor.class);

    public Visitor(String fullName, int age, String dateOFVisit, String timeOfVisit, String comments, String assistantName) {
        this.fullName = fullName;
        this.age = age;
        this.dateOFVisit = dateOFVisit;
        this.timeOfVisit = timeOfVisit;
        this.comments = comments;
        this.assistantName = assistantName;
    }

    void save() {
        //name convention of  the file
        String fileNameConvention = "visitor_" + fullName + ".txt";

        //file name is lower case and space is replaced by underscore.
        String fileName = fileNameConvention.toLowerCase().replace(" ", "_");

        // use try with resources to create/open the file
        try (FileWriter fileWriter = new FileWriter(fileName)) {

            fileWriter.write(fullName + "\n");
            fileWriter.write(age + "\n");
            fileWriter.write(dateOFVisit + "\n");
            fileWriter.write(timeOfVisit + "\n");
            fileWriter.write(comments + "\n");
            fileWriter.write(assistantName);
            logger.info("Save Successful!");


        } catch (IOException e) {
            logger.error(e.getMessage());
        }
    }
    void load(String name){

        // the name should first be converted into the initially proposed file convention
        String nameConvention = "visitor_" + name.toLowerCase().replace(" ", "_") + ".txt";

        final String[] fields = {"Full Name", "Age", "Date Of Visit", "Time Of Visit", "Comments", "Assistant Name"};

        //open the file to read contents
        String line;
        int fieldsCounter = 0;

        try(BufferedReader fileReader = new BufferedReader(new FileReader(nameConvention))){
            while ((line = fileReader.readLine()) != null ){
                out.printf("%-11s \t%s%n", fields[fieldsCounter], line);
                fieldsCounter++;
            }
            logger.info("Read Successful!");

        }catch (Exception e){
//           e.printStackTrace();
            logger.error(e.getMessage());
        }
    }
}