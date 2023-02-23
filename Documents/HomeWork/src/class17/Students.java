package class17;

public class Students {
    String name;


    int gradeHistory;
    int gradeMath;
    int gradeLit;

    Students(String sName, int sGradeHistory, int sGradeMath, int sGradeLit) {
        name = sName;
        gradeHistory = sGradeHistory;
        gradeMath = sGradeMath;
        gradeLit = sGradeLit;
    }


    public void totalGrade() {
        System.out.println(name+" "+(gradeHistory  + gradeMath  + gradeLit));


    }
}