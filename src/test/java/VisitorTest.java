import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class VisitorTest {
    Visitor visitor =  new Visitor("Onke Fanti", "34", "No Comment", "John The Ripper");
    @Test
    void readNonExistingFileError() {
        Exception exception = assertThrows(Exception.class, () -> {
            visitor.load("nonExistingFile");
        });
        String actualMessage = exception.getMessage();
        assertFalse(actualMessage.contains("The was a problem in writing to the file"));
    }

}