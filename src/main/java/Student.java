// Note that if a student has withdrawn, then the student is skipped in the final assessment file
// Things to test: printStudent, creating student object
public class Student {

    private int studentNum;
    private char gender;
    private boolean disability;
    private String highestEd;
    private String ageBand;
    private int gradYear;
    private int finalGrade;

    public Student(int sNum, char gender, boolean disability, String highestEd, String age, int grad, int finalG) {

        this.studentNum = sNum;
        this.gender = gender;
        this.disability = disability;
        this.highestEd = highestEd;
        this.ageBand = age;
        this.gradYear = grad;
        this.finalGrade = finalG;
    }

    public int getSNum() {

        return studentNum;
    }

    /* Need getters for the student data
       Any other functions?

       Print/toString() student?


     */
}