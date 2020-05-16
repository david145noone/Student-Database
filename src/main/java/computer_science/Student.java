package computer_science;

public class Student {

    private String firstName;
    private String surName;
    private int studentNum;
    private int currentYear;
    private Grade grades;

    public Student(String fName, String sName, int sNum, int curYear) {

        setFirstName(fName);
        setSName(sName);
        setStudentNum(sNum);
    }

    public void setFirstName(String firstName) {

        this.firstName = firstName;
    }
    public void setSName(String surName) {

        this.surName = surName;
    }
    public void setStudentNum(int studentNum) {

        this.studentNum = studentNum;
    }

    public String getFirstName() {

        return firstName;
    }

    public String getSurName() {

        return surName;
    }

    public int getSNum() {

        return studentNum;
    }
}