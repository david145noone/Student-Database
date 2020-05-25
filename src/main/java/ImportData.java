/* need collections
idea: so ImportData is supposed to try to import each line
 of StudentInfo, and create a HashMap of key- values, using sNum as key
*/
import java.io.*;
import java.util.*;

public class ImportData {

    private String filePath;
    private HashMap<Integer, Student> students;

    public ImportData(String filePath) {
        this.filePath = filePath;
        students = new HashMap<>();
    }

    public void openFile() {

    }

    // for each line of the file we want to add a student to the hashmap
    public void addStudent() {

    }

    public void closeFile() {

    }
}
